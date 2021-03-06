package com.example.myanimation;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link button_fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class button_fragment extends Fragment {
    Button btn_idle,btn_attack,btn_run,btn_crouch,btn_jump;
    public listnera listner;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public button_fragment() {
        // Required empty public constructor
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            listner = (listnera) context;
        }catch (ClassCastException exp)
        {
            throw new ClassCastException(context.toString() + "Interface not created in the host Activity");

        }
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment button_fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static button_fragment newInstance(String param1, String param2) {
        button_fragment fragment = new button_fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.button_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        btn_attack=getActivity().findViewById(R.id.btn_attack);
        btn_crouch=getActivity().findViewById(R.id.btn_crouch);
        btn_idle=getActivity().findViewById(R.id.btn_idle);
        btn_jump=getActivity().findViewById(R.id.btn_jump);
        btn_run=getActivity().findViewById(R.id.btn_run);

        btn_attack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listner.senddata(1);
            }
        });
        btn_run.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                listner.senddata(2);
            }
        });
        btn_jump.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                listner.senddata(3);
            }
        });
        btn_idle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                listner.senddata(4);
            }
        });
        btn_crouch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                listner.senddata(5);
            }
        });

    }

    public interface listnera {
        public void senddata(int val);
    }
}