package kr.co.company.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn;
    private String editTextstr;

    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView)findViewById(R.id.list);
        editText =(EditText)findViewById(R.id.editText);
        btn = (Button)findViewById(R.id.btn);

        List<String> data = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data);

        list.setAdapter(adapter);

        data.add("시작");
        adapter.notifyDataSetChanged();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextstr = editText.getText().toString();
                data.add(editTextstr);
                adapter.notifyDataSetChanged();
            }
        });

    }
}