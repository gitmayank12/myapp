package thinkpro.app.art;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

import thinkpro.app.art.Adapter.CourseGVAdapter;
import thinkpro.app.art.Model.CourseModel;


public class UploadFragment extends Fragment {

    GridView coursesGV;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_upload,container,false);

        coursesGV = view.findViewById(R.id.idGVcourses);
        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();
        courseModelArrayList.add(new CourseModel( R.drawable.abstractart));
        courseModelArrayList.add(new CourseModel( R.drawable.abstractart));
        CourseGVAdapter adapter = new CourseGVAdapter(getActivity(), courseModelArrayList);
        coursesGV.setAdapter(adapter);

        return view;
    }
}