package com.example.nguru_;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.DocumentSnapshot;

public class ConstiAdapter extends FirestoreRecyclerAdapter<Constituyentes, ConstiAdapter.ViewHolder> {

    Activity activity;

    /**
     * Create a new RecyclerView adapter that listens to a Firestore Query.  See {@link
     * FirestoreRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public ConstiAdapter(@NonNull FirestoreRecyclerOptions<Constituyentes> options, Activity activity) {
        super(options);
        this.activity = activity;
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, int position, @NonNull Constituyentes constituyentes) {

        DocumentSnapshot constituyenteId = getSnapshots().getSnapshot(holder.getAdapterPosition());
        final String id = constituyenteId.getId();

        holder.nombreText.setText(constituyentes.getNombre());
        holder.partidoText.setText(constituyentes.getDistrito());
        holder.distritoText.setText(constituyentes.getPartido());

        holder.btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, ConstiUsers.class);
                intent.putExtra("id", id);
                activity.startActivity(intent);
            }
        });
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_constituyentes, parent, false);
        return new ViewHolder(view);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nombreText;
        TextView partidoText;
        TextView distritoText;
        Button btnInfo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nombreText = itemView.findViewById(R.id.nombreText);
            partidoText = itemView.findViewById(R.id.partidoText);
            distritoText = itemView.findViewById(R.id.distritoText);
            btnInfo =itemView.findViewById(R.id.infoConstiBtn);
        }
    }
}
