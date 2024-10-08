package vn.edu.usth.nutritionrecipe.ui.explore;

import android.os.Bundle;

import android.content.Intent;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import vn.edu.usth.nutritionrecipe.databinding.ActivityFoodDetailBinding;
import vn.edu.usth.nutritionrecipe.R;

public class FoodDetail extends AppCompatActivity {

    ActivityFoodDetailBinding binding;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            binding = ActivityFoodDetailBinding.inflate(getLayoutInflater());
            setContentView(binding.getRoot());
            Intent intent = this.getIntent();
            if (intent != null){
                String name = intent.getStringExtra("name");
                String time = intent.getStringExtra("time");
                int ingredients = intent.getIntExtra("ingredients", R.string.pastaIngredients);
                int desc = intent.getIntExtra("desc", R.string.pastaDescription);
                int image = intent.getIntExtra("image", R.drawable.pasta);
                binding.detailName.setText(name);
                binding.detailTime.setText(time);
                binding.detailDesc.setText(desc);
                binding.detailIngredients.setText(ingredients);
                binding.detailImage.setImageResource(image);
            }
        }
}