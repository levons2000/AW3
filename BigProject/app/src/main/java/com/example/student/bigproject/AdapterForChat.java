package com.example.student.bigproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Student on 7/11/2018.
 */

class AdapterForChat extends RecyclerView.Adapter<AdapterForChat.ChatViewHolder> {

    private List<ChatModel> list;
    private Context context;
    private int resource;
    //OnItemClickListere onItemClickListere;

    AdapterForChat(Context context, List<ChatModel> list, int resource) {
        this.context = context;
        this.list = list;
        this.resource = resource;
    }

   /* public interface OnItemClickListere{
        void onItemClick(int position, Context context);
    }
*/

    @Override
    public ChatViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(resource, parent, false);
        return new ChatViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ChatViewHolder holder, int position) {

        holder.nameText.setText(getItemByPosition(position).getName());
        holder.statusText.setText(getItemByPosition(position).getStatus());
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), getItemByPosition(position).getImgResource());
        RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(context.getResources(), bitmap);
        roundedBitmapDrawable.setCircular(true);
        holder.userImage.setImageDrawable(roundedBitmapDrawable);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ChatViewHolder extends RecyclerView.ViewHolder {

        ImageView userImage;
        TextView nameText;
        TextView statusText;

        ChatViewHolder(final View itemView) {
            super(itemView);
            userImage = itemView.findViewById(R.id.chat_user_image);
            nameText = itemView.findViewById(R.id.name_view);
            statusText = itemView.findViewById(R.id.status_view);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ChatActivity.fragmentSetter(list.get(getAdapterPosition()));
                }
            });
        }
    }

    private ChatModel getItemByPosition(int position) {
        return list.get(position);
    }
   /* public void setOnItemClickListere (OnItemClickListere onItemClickListere){
        this.onItemClickListere = onItemClickListere;
    }*/
}
