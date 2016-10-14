package ee.ut.cs.mc.and.testingapplication1311;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ShoppingListViewAdapter extends ArrayAdapter<ShoppingItem> {
    public ShoppingListViewAdapter(Context context, ArrayList<ShoppingItem> shoppingItems) {
        super(context, 0, shoppingItems);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        ShoppingItem item = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_shopping_item, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.tv_item_name);
        TextView tvPrice = (TextView) convertView.findViewById(R.id.tv_item_cost);
        TextView tvAmount = (TextView) convertView.findViewById(R.id.tv_item_amount);

        // Populate the data into the template view using the data object
        tvName.setText(item.name);
        tvPrice.setText(String.valueOf(item.price));
        tvAmount.setText(String.valueOf(item.amount));
        // Return the completed view to render on screen
        return convertView;
    }

}
