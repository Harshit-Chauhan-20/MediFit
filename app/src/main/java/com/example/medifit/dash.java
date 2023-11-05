package com.example.medifit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.RequestQueue;

public class dash extends AppCompatActivity {
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash);
        textView = findViewById(R.id.textView3);

//        RequestQueue requestQueue = Volley.newRequestQueue(this);
//        String url = "https://gla-app-380323-default-rtdb.firebaseio.com/"; // Replace with your server URL
//
//        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null,
//                new Response.Listener<JSONObject>() {
//                    @Override
//                    public void onResponse(JSONObject response) {
//                        try {
//                            // Parse the JSON response here and update the UI as needed
//                            String result = response.getString("key"); // Replace "key" with the actual key in your response
//                            textView.setText(result);
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                            // Handle JSON parsing errors here
//                        }
//                    }
//                },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        Log.d("myapp", "Error: " + error.getMessage());
//                        if (error.networkResponse != null) {
//                            int statusCode = error.networkResponse.statusCode;
//                            Log.d("myapp", "Status Code: " + statusCode);
//                            byte[] data = error.networkResponse.data;
//                            if (data != null) {
//                                String responseString = new String(data);
//                                Log.d("myapp", "Response: " + responseString);
//
//                                // Check content type
//                                String contentType = error.networkResponse.headers.get("Content-Type");
//                                Log.d("myapp", "Content-Type: " + contentType);
//
//                                // Handle the response based on content type
//                                if (contentType != null && contentType.startsWith("application/json")) {
//                                    // It's JSON content but couldn't be parsed
//                                    // Handle JSON parsing error here
//                                } else {
//                                    // It's not JSON content, handle it accordingly (e.g., show an error message)
//                                    Toast.makeText(MainActivity2.this, "Error: Server returned non-JSON content", Toast.LENGTH_SHORT).show();
//                                }
//                            }
//                        } else {
//                            // Handle other network errors here
//                            Toast.makeText(MainActivity2.this, "Error: Network error", Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                });
//
//        requestQueue.add(jsonObjectRequest);
    }
}


//package com.example.medifit;
//
//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//import android.widget.TextView;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//
//public class dash extends AppCompatActivity {
//    private TextView textView;
//    private DatabaseReference databaseReference;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_dash);
//        textView = findViewById(R.id.textView3);
//
//        // Initialize Firebase Database reference
//        databaseReference = FirebaseDatabase.getInstance().getReference().child("https://medi-fit-a00a4-default-rtdb.firebaseio.com/"
//                ); // Replace with your database node
//
//        // Set up a ValueEventListener to listen for changes
//        databaseReference.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                // This method is called whenever the data at the specified database reference changes
//                if (dataSnapshot.exists()) {
//                    String data = dataSnapshot.getValue(String.class); // Assuming the data is a String
//                    textView.setText(data);
//                } else {
//                    // Handle the case where the data does not exist
//                    textView.setText("No data available");
//                }
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//                // Handle any errors
//            }
//        });
//    }
//}
