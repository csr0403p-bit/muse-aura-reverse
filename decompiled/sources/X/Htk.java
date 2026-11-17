package X;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;

/* loaded from: classes6.dex */
public final class Htk implements Runnable {
    public static final String __redex_internal_original_name = "SearchView$SearchAutoComplete$1";
    public final /* synthetic */ SearchView$SearchAutoComplete A00;

    public Htk(SearchView$SearchAutoComplete searchView$SearchAutoComplete) {
        this.A00 = searchView$SearchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.A00;
        if (searchView$SearchAutoComplete.A00) {
            ((InputMethodManager) C8j4.A0n(searchView$SearchAutoComplete)).showSoftInput(searchView$SearchAutoComplete, 0);
            searchView$SearchAutoComplete.A00 = false;
        }
    }
}
