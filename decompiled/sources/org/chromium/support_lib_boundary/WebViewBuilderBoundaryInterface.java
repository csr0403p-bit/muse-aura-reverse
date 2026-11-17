package org.chromium.support_lib_boundary;

import X.AnonymousClass001;
import X.C3cG;
import X.C60Q;
import android.content.Context;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public interface WebViewBuilderBoundaryInterface {

    public class Config implements Consumer<BiConsumer<Integer, Object>> {
        public String profileName;
        public boolean restrictJavascriptInterface;
        public int baseline = 0;
        public List<Object> A00 = C3cG.A0h();
        public Map<String, Boolean> A02 = C3cG.A0j();
        public List<List<String>> A01 = C3cG.A0h();

        @Override // java.util.function.Consumer
        public void accept(BiConsumer<Integer, Object> biConsumer) {
            biConsumer.accept(0, Integer.valueOf(this.baseline));
            biConsumer.accept(2, Boolean.valueOf(this.restrictJavascriptInterface));
            biConsumer.accept(1, new Object[]{this.A00, new ArrayList(this.A02.keySet()), this.A01});
            String str = this.profileName;
            if (str != null) {
                biConsumer.accept(3, str);
            }
        }

        public void addJavascriptInterface(Object obj, String str, List<String> list) {
            Map<String, Boolean> map = this.A02;
            if (map.containsKey(str)) {
                throw C60Q.A0V("A duplicate JavaScript interface was provided for \"", str, "\"");
            }
            this.A00.add(obj);
            map.put(str, AnonymousClass001.A0i());
            this.A01.add(list);
        }
    }

    void applyTo(WebView webView, Consumer<BiConsumer<Integer, Object>> consumer);

    WebView build(Context context, Consumer<BiConsumer<Integer, Object>> consumer);
}
