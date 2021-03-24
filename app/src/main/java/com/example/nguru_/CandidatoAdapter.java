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

public class CandidatoAdapter extends FirestoreRecyclerAdapter<Candidatos, CandidatoAdapter.ViewHolder> {

    Activity activity;

    /**
     * Create a new RecyclerView adapter that listens to a Firestore Query.  See {@link
     * FirestoreRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public CandidatoAdapter(@NonNull FirestoreRecyclerOptions<Candidatos> options, Activity activity) {
        super(options);
        this.activity = activity;
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, int position, @NonNull Candidatos candidatos) {

        DocumentSnapshot CandidatosC = getSnapshots().getSnapshot(holder.getAdapterPosition());

        final String id = CandidatosC.getId();

        holder.textViewNombre.setText(candidatos.getNombre());
        holder.textViewDistrito.setText(candidatos.getDistrito());
        holder.textViewPartido.setText(candidatos.getPartido());

        holder.buttonInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, MasInfoCandidatos.class);
                intent.putExtra("id", id );
                activity.startActivity(intent);
            }
        });
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_candidatos, parent, false);
        return new ViewHolder(view);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView textViewNombre;
        TextView textViewDistrito;
        TextView textViewPartido;
        Button buttonInfo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewNombre = itemView.findViewById(R.id.textViewNombre);
            textViewDistrito = itemView.findViewById(R.id.textViewDistrito);
            textViewPartido = itemView.findViewById(R.id.textViewPartido);
            buttonInfo = itemView.findViewById(R.id.masInfo);
        }
    }
}
