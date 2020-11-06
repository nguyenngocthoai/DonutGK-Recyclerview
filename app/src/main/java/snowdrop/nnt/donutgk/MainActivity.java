package snowdrop.nnt.donutgk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcv;
    private DonutAdapter donutAdapter;
    private ArrayList<Donut> arrayList;

    private RecyclerView rcvtab;
    private DonutCategoryAdapter donutCategoryAdapter;
    private ArrayList<DonutCategory> arrayList_tab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         *list_donut
         */
        rcv = findViewById(R.id.rcv);
        arrayList = new ArrayList<>();
        arrayList.add(new Donut("Bánh Donut đỏ", R.drawable.donut_red));
        arrayList.add(new Donut("Bánh Donut vàng", R.drawable.donut_yellow));
        arrayList.add(new Donut("Bánh Donut xanh", R.drawable.green_donut));
        arrayList.add(new Donut("Bánh Donut tím", R.drawable.tasty_donut));
        arrayList.add(new Donut("Bánh Donut đỏ", R.drawable.donut_red));
        arrayList.add(new Donut("Bánh Donut vàng", R.drawable.donut_yellow));
        arrayList.add(new Donut("Bánh Donut xanh", R.drawable.green_donut));
        arrayList.add(new Donut("Bánh Donut tím", R.drawable.tasty_donut));

        donutAdapter = new DonutAdapter(this, arrayList);
        rcv.setAdapter(donutAdapter);
        rcv.setLayoutManager(new GridLayoutManager(this, 1));
        /**
         * list_donut_tab
         */
        rcvtab = findViewById(R.id.rcvtab);
        arrayList_tab = new ArrayList<>();
        arrayList_tab.add(new DonutCategory(R.drawable.donut_red, "All Donut"));
        arrayList_tab.add(new DonutCategory(R.drawable.donut_red, "Red Donut"));
        arrayList_tab.add(new DonutCategory(R.drawable.donut_yellow, "Yellow Donut"));
        arrayList_tab.add(new DonutCategory(R.drawable.green_donut, "Green Donut"));
        arrayList_tab.add(new DonutCategory(R.drawable.tasty_donut, "Tasty Donut"));

        donutCategoryAdapter=new DonutCategoryAdapter(this,arrayList_tab);
        rcvtab.setAdapter(donutCategoryAdapter);
        rcvtab.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }
}