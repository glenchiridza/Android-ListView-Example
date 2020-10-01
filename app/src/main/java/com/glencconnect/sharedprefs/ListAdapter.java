package com.glencconnect.sharedprefs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import static com.glencconnect.sharedprefs.Books.authors;
import static com.glencconnect.sharedprefs.Books.books;

public class ListAdapter extends BaseAdapter {

    private Context context;
    private List<Books> booksList;
    public ListAdapter(Context context, List<Books> booksList){

        this.booksList = booksList;
        this.context = context;
    }
    @Override
    public int getCount() {
        return books.length;
    }

    @Override
    public Object getItem(int position) {
        return booksList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final ViewHolder holder;

        if (convertView == null){

            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, null);
            holder = new ViewHolder();
            holder.bookAuthor = convertView.findViewById(R.id.author_name);
            holder.bookName = convertView.findViewById(R.id.book_name);
            convertView.setTag(holder);

        }else {
            holder = (ViewHolder) convertView.getTag();

        }
        holder.bookName.setText(books[position]);
        holder.bookAuthor.setText(authors[position]);
        return convertView;
    }


    private static class ViewHolder {
        TextView bookName;
        TextView bookAuthor;

    }
}
