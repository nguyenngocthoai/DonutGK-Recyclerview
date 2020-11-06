package snowdrop.nnt.donutgk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DonutCategoryAdapter extends RecyclerView.Adapter<DonutCategoryAdapter.ViewHoder> {
    private LayoutInflater layoutInflater;
    private ArrayList<DonutCategory> arrayList;

    public DonutCategoryAdapter(Context context, ArrayList<DonutCategory> arrayList) {
        this.arrayList = arrayList;
        layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public DonutCategoryAdapter.ViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.donut_category, parent, false);
        return new ViewHoder(view, this);
    }

    @Override
    public void onBindViewHolder(@NonNull DonutCategoryAdapter.ViewHoder holder, int position) {
        holder.image_tab.setImageResource(arrayList.get(position).getImage_tab());
        holder.name_tab.setText(arrayList.get(position).getName_tab());

//        holder.layout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(v.getContext(), arrayList.get(position).getName_tab(), Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHoder extends RecyclerView.ViewHolder {
        private ImageView image_tab;
        private TextView name_tab;
        private DonutCategoryAdapter donutCategoryAdapter;
        private ConstraintLayout layout;

        public ViewHoder(@NonNull View itemView, DonutCategoryAdapter donutCategoryAdapter) {
            super(itemView);
            image_tab = itemView.findViewById(R.id.image_tab);
            name_tab = itemView.findViewById(R.id.name_tab);
            layout = itemView.findViewById(R.id.rcvtab);
            this.donutCategoryAdapter = donutCategoryAdapter;

        }
    }
}
