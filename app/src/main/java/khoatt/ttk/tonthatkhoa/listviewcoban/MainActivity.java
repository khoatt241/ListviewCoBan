package khoatt.ttk.tonthatkhoa.listviewcoban;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter banve;
    ArrayList<String> mangmonhoc = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.listview);
        mangmonhoc.add("Toán");
        mangmonhoc.add("Lý");
        mangmonhoc.add("Hóa");
        mangmonhoc.add("Sinh");
        mangmonhoc.add("Sử");
        mangmonhoc.add("Địa");
        banve = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, mangmonhoc);
        lv.setAdapter(banve);
        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                mangmonhoc.remove(position);
                banve.notifyDataSetChanged();
                return false;
            }
        });
    }
}
