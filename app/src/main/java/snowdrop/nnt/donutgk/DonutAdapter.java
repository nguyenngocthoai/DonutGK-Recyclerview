package snowdrop.nnt.donutgk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DonutAdapter extends RecyclerView.Adapter<DonutAdapter.ViewHoder> {
    private LayoutInflater layoutInflater;
    private ArrayList<Donut> arrayList;

    public DonutAdapter(Context context, ArrayList<Donut> arrayList) {
        layoutInflater = LayoutInflater.from(context);
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public DonutAdapter.ViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.list_donut, parent, false);
        return new ViewHoder(view, this);
    }

    @Override
    public void onBindViewHolder(@NonNull DonutAdapter.ViewHoder holder, int position) {
        String mCurent = arrayList.get(position).getName();
        holder.name.setText(mCurent);
        int img = arrayList.get(position).getImage();
        holder.image.setImageResource(img);
        holder.image.setImageResource(arrayList.get(position).getImage());
        holder.name.setText(arrayList.get(position).getName());
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                open activity DonutDetail and send data to donut_detail
                Intent intent = new Intent(v.getContext(), DonutDetail.class);
                intent.putExtra("name_detail", mCurent);
                Bundle bundle =new Bundle();
                bundle.putInt("image_detail",img);
                intent.putExtras(bundle);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHoder extends RecyclerView.ViewHolder {
        private TextView name;
        private ImageView image;
        private ConstraintLayout layout;
        private DonutAdapter donutAdapter;

        public ViewHoder(@NonNull View itemView, DonutAdapter donutAdapter) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            image = itemView.findViewById(R.id.image);
            layout = itemView.findViewById(R.id.layout);
            this.donutAdapter = donutAdapter;
        }
    }
}
