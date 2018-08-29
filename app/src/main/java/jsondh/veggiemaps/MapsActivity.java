package jsondh.veggiemaps;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng arbolDeSeda = new LatLng(9.935479, -84.061856);
        LatLng ravi = new LatLng(9.934618, -84.063455);
        LatLng kalu = new LatLng(9.934956, -84.064356);
        LatLng mantras = new LatLng(9.937048, -84.061845);

        mMap.addMarker(new MarkerOptions()
                .position(arbolDeSeda)
                .title("Árbol de Seda")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.gluten_free)));
        mMap.addMarker(new MarkerOptions()
                .position(ravi)
                .title("Rávi")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.gluten_free)));
        mMap.addMarker(new MarkerOptions()
                .position(kalu)
                .title("Kalú")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.gluten_free)));
        mMap.addMarker(new MarkerOptions()
                .position(mantras)
                .title("Mantras Veggies Coffe")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.gluten_free)));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(arbolDeSeda));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(16.0f));

    }
}
