package br.com.daciosoftware.dsiot.ui.iot130;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import br.com.daciosoftware.dsiot.R;

public class Iot130Fragment extends Fragment {

    private Iot130ViewModel iot130ViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        iot130ViewModel =
                new ViewModelProvider(this).get(Iot130ViewModel.class);
        View root = inflater.inflate(R.layout.fragment_iot130, container, false);
        final WebView webView = root.findViewById(R.id.webviewIot130);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://192.168.0.130");

        return root;
    }
}