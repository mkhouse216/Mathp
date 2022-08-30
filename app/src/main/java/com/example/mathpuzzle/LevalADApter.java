package com.example.mathpuzzle;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class LevalADApter extends RecyclerView.Adapter<LevalADApter.Levelclass> {

    levalpage levalpage;

    public LevalADApter(levalpage levalpage) {

        this.levalpage = levalpage;

    }

    @NonNull
    @Override
    public Levelclass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(levalpage).inflate(R.layout.levalclass, parent, false);

        Levelclass levelclass = new Levelclass(view);

        return levelclass;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull Levelclass holder, @SuppressLint("RecyclerView") int position) {

        String levelposition = MainActivity.statuslist.get(position);
        int lev = MainActivity.sp.getInt("level", 0);
        holder.setIsRecyclable(false);

        if (levelposition.equals(MainActivity.Isclear)) {
            holder.imageView.setImageResource(R.drawable.tick);
            holder.mylevel.setText("" + (position + 1));

            holder.mylevel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(levalpage, gamepage.class);
                    intent.putExtra("pos", position);
                    levalpage.startActivity(intent);
                    levalpage.finish();
                }
            });

        } else if (levelposition.equals(MainActivity.Isskip)) {
            holder.imageView.setImageResource(0);
            holder.mylevel.setText("" + (position + 1));

            holder.mylevel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(levalpage, gamepage.class);
                    intent.putExtra("pos", position);
                    levalpage.startActivity(intent);
                    levalpage.finish();
                }
            });
        } else {
            if (lev == position) {
                holder.imageView.setImageResource(0);
                holder.mylevel.setText("" + (position + 1));

                holder.mylevel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        levalpage.startActivity(new Intent(levalpage, gamepage.class).putExtra("pos", position));
                        levalpage.finish();
                    }
                });

            } else {
                holder.imageView.setImageResource(R.drawable.lock);
            }
        }

    }

    @Override
    public int getItemCount() {
        return 75;
    }

    public class Levelclass extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView mylevel;


        public Levelclass(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image123);
            mylevel = itemView.findViewById(R.id.mylevel);

        }
    }
}
