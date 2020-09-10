package com.example.pluralsight.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pluralsight.R;
import com.example.pluralsight.models.Student;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder> {
    private Context context;
    private List<Student> students;

    public StudentAdapter(Context context, List<Student> students) {
        this.context = context;
        this.students = students;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Student student = students.get(position);
        holder.name.setText(student.getName());
        //TODO to refactor later
       String details;
        if (student.getScore() == 0) {
            details = String.format("%d learning hours, %s", student.getHours(),
                    student.getCountry());

        } else {
            details = String.format("%d skill IQ score, %s", student.getScore(),
                    student.getCountry());
        }
        holder.details.setText(details);

    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView badge;
        public TextView name, details;

        public ViewHolder(View itemView) {
            super(itemView);
            badge = itemView.findViewById(R.id.badge);
            name = itemView.findViewById(R.id.name);
            details = itemView.findViewById(R.id.details);
        }
    }
}