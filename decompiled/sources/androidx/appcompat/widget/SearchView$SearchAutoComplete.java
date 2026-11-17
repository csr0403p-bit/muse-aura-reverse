package androidx.appcompat.widget;

import X.AbstractC7609F5w;
import X.AbstractC8344FcH;
import X.BV4;
import X.C8167FXj;
import X.C8j4;
import X.Htk;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.facebook.aura.R;

/* loaded from: classes6.dex */
public class SearchView$SearchAutoComplete extends C8167FXj {
    public boolean A00;
    public int A01;
    public AbstractC8344FcH A02;
    public final Runnable A03;

    public SearchView$SearchAutoComplete(Context context) {
        this(context, null);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    throw BV4.A0a("clearFocus");
                }
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.A01 <= 0 || super.enoughToFilter();
    }

    @Override // android.widget.AutoCompleteTextView
    public final void performCompletion() {
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
    }

    public void setSearchView(AbstractC8344FcH abstractC8344FcH) {
        this.A02 = abstractC8344FcH;
    }

    private int getSearchViewTextMinWidthDp() {
        Configuration configuration = getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i >= 960) {
            if (i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
        } else if (i < 600) {
            return 160;
        }
        return 192;
    }

    @Override // X.C8167FXj, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.A00) {
            Runnable runnable = this.A03;
            removeCallbacks(runnable);
            post(runnable);
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), AbstractC7609F5w.A0S(this)));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        throw BV4.A0a("onTextFocusChanged");
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            throw BV4.A0a("hasFocus");
        }
    }

    public void setImeVisibility(boolean z) {
        InputMethodManager inputMethodManager = (InputMethodManager) C8j4.A0n(this);
        if (!z) {
            this.A00 = false;
            removeCallbacks(this.A03);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else {
            if (!inputMethodManager.isActive(this)) {
                this.A00 = true;
                return;
            }
            this.A00 = false;
            removeCallbacks(this.A03);
            inputMethodManager.showSoftInput(this, 0);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setThreshold(int i) {
        super.setThreshold(i);
        this.A01 = i;
    }

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A03 = new Htk(this);
        this.A01 = getThreshold();
    }

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr._name_removed__res_0x7f04005a);
    }
}
