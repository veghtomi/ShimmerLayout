package io.supercharge.shimmeringlayout.tests.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.supercharge.shimmeringlayout.R;
import io.supercharge.shimmerlayout.ShimmerLayout;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ShimmerViewHolder> {

    @Override
    public ShimmerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_shimmer,
                parent, false);

        return new ShimmerViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(ShimmerViewHolder holder, int position) {
        holder.shimmerLayout.startShimmerAnimation();
    }

    @Override
    public int getItemCount() {
        return 15;
    }

    public static class ShimmerViewHolder extends RecyclerView.ViewHolder {

        ShimmerLayout shimmerLayout;

        public ShimmerViewHolder(View itemView) {
            super(itemView);
            shimmerLayout = itemView.findViewById(R.id.recycler_view_test_view_holder_shimmer);
        }
    }
}
