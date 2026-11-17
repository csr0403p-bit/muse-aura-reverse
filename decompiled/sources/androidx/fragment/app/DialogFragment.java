package androidx.fragment.app;

import X.AbstractC1720Ap8;
import X.AbstractC7607F5u;
import X.AbstractC8330Fbx;
import X.AbstractC8571FgQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.BV5;
import X.BV8;
import X.Bs1;
import X.C1HY;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import X.C8287FbB;
import X.C8303FbU;
import X.C8573FgU;
import X.DialogC10469Hka;
import X.FGI;
import X.FNH;
import X.FgY;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.aura.R;
import java.io.IOException;

/* loaded from: classes6.dex */
public class DialogFragment extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public static final String SAVED_BACK_STACK_ID = "android:backStackId";
    public static final String SAVED_CANCELABLE = "android:cancelable";
    public static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    public static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    public static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    public static final String SAVED_STYLE = "android:style";
    public static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    public int mBackStackId;
    public boolean mCancelable;
    public boolean mCreatingDialog;
    public Dialog mDialog;
    public boolean mDialogCreated;
    public Runnable mDismissRunnable;
    public boolean mDismissed;
    public Handler mHandler;
    public Bs1<C1HY> mObserver;
    public DialogInterface.OnCancelListener mOnCancelListener;
    public DialogInterface.OnDismissListener mOnDismissListener;
    public boolean mShownByMe;
    public boolean mShowsDialog;
    public int mStyle;
    public int mTheme;
    public boolean mViewDestroyed;

    public void dismiss() {
        dismissInternal(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        dismissInternal(true, false, false);
    }

    public void dismissNow() {
        dismissInternal(false, false, true);
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.mCalled = true;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        this.mCalled = true;
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        this.mViewLifecycleOwnerLiveData.A07(this.mObserver);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        this.mCalled = true;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            AbstractC1720Ap8.A01(decorView, this);
            C7384Etj.A0Y(decorView, 0);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        this.mCalled = true;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        this.mCalled = true;
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    public void setStyle(int i, int i2) {
        if (AbstractC8571FgQ.A0N(2)) {
            StringBuilder sbA0f = C3cG.A0f(this, "Setting style and theme for DialogFragment ");
            sbA0f.append(" to ");
            sbA0f.append(i);
            AbstractC7607F5u.A1O(C60P.A1O(", ", sbA0f, i2));
        }
        this.mStyle = i;
        if (i == 2 || i == 3) {
            this.mTheme = android.R.style.Theme.Panel;
        }
        if (i2 != 0) {
            this.mTheme = i2;
        }
    }

    public void setupDialog(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public int show(FgY fgY, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        fgY.A01(this, str, 0, 1);
        this.mViewDestroyed = false;
        int iA03 = ((C8573FgU) fgY).A03(false, true);
        this.mBackStackId = iA03;
        return iA03;
    }

    public void showNow(AbstractC8571FgQ abstractC8571FgQ, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        C8573FgU c8573FgU = new C8573FgU(abstractC8571FgQ);
        c8573FgU.A0G = true;
        c8573FgU.A01(this, str, 0, 1);
        c8573FgU.A00();
        c8573FgU.A02.A0q(c8573FgU, false);
    }

    private void dismissInternal(boolean z, boolean z2, boolean z3) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId < 0) {
            C8573FgU c8573FgU = new C8573FgU(getParentFragmentManager());
            c8573FgU.A0G = true;
            c8573FgU.A06(this);
            if (z3) {
                c8573FgU.A00();
                c8573FgU.A02.A0q(c8573FgU, false);
                return;
            } else if (z) {
                c8573FgU.A03(true, true);
                return;
            } else {
                c8573FgU.A03(false, true);
                return;
            }
        }
        if (z3) {
            AbstractC8571FgQ parentFragmentManager = getParentFragmentManager();
            int i = this.mBackStackId;
            if (i < 0) {
                throw BV5.A0Q("Bad id: ", i);
            }
            AbstractC8571FgQ.A0Q(parentFragmentManager, i, 1);
        } else {
            AbstractC8571FgQ parentFragmentManager2 = getParentFragmentManager();
            int i2 = this.mBackStackId;
            if (i2 < 0) {
                throw BV5.A0Q("Bad id: ", i2);
            }
            parentFragmentManager2.A0p(new FNH(parentFragmentManager2, null, i2, 1), z);
        }
        this.mBackStackId = -1;
    }

    private void prepareDialog(Bundle bundle) {
        if (!this.mShowsDialog || this.mDialogCreated) {
            return;
        }
        try {
            this.mCreatingDialog = true;
            Dialog dialogOnCreateDialog = onCreateDialog(bundle);
            this.mDialog = dialogOnCreateDialog;
            if (this.mShowsDialog) {
                setupDialog(dialogOnCreateDialog, this.mStyle);
                Context context = getContext();
                if (context instanceof Activity) {
                    this.mDialog.setOwnerActivity((Activity) context);
                }
                this.mDialog.setCancelable(this.mCancelable);
                this.mDialog.setOnCancelListener(this.mOnCancelListener);
                this.mDialog.setOnDismissListener(this.mOnDismissListener);
                this.mDialogCreated = true;
            } else {
                this.mDialog = null;
            }
        } finally {
            this.mCreatingDialog = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public AbstractC8330Fbx createFragmentContainer() {
        return new C8303FbU(this, new C8287FbB(this));
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (AbstractC8571FgQ.A0M()) {
            AbstractC7607F5u.A1O(AnonymousClass007.A0a("onDismiss called for DialogFragment ", this));
        }
        dismissInternal(true, true, false);
    }

    public View onFindViewById(int i) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    public boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, bundleOnSaveInstanceState);
        }
        int i = this.mStyle;
        if (i != 0) {
            bundle.putInt(SAVED_STYLE, i);
        }
        int i2 = this.mTheme;
        if (i2 != 0) {
            bundle.putInt(SAVED_THEME, i2);
        }
        boolean z = this.mCancelable;
        if (!z) {
            bundle.putBoolean(SAVED_CANCELABLE, z);
        }
        boolean z2 = this.mShowsDialog;
        if (!z2) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z2);
        }
        int i3 = this.mBackStackId;
        if (i3 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i3);
        }
    }

    public final Dialog requireDialog() {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog;
        }
        throw BV8.A0m(" does not have a Dialog.", C3cG.A0f(this, "DialogFragment "));
    }

    public void setCancelable(boolean z) {
        this.mCancelable = z;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void setShowsDialog(boolean z) {
        this.mShowsDialog = z;
    }

    public DialogFragment() {
        Fragment.A03(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mViewLifecycleOwnerLiveData.A08(this.mObserver);
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) throws IOException {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = AnonymousClass002.A1M(this.mContainerId);
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (AbstractC8571FgQ.A0M()) {
            AbstractC7607F5u.A1O(AnonymousClass007.A0a("onCreateDialog called for DialogFragment ", this));
        }
        return new DialogC10469Hka(requireContext(), this.mTheme);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflater = getLayoutInflater(bundle);
        if (this.mShowsDialog && !this.mCreatingDialog) {
            prepareDialog(bundle);
            if (AbstractC8571FgQ.A0N(2)) {
                Log.d("FragmentManager", AnonymousClass001.A0v(" from dialog context", C3cG.A0f(this, "get layout inflater for DialogFragment ")));
            }
            Dialog dialog = this.mDialog;
            if (dialog != null) {
                return layoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (AbstractC8571FgQ.A0N(2)) {
            Log.d("FragmentManager", FGI.A0M(!this.mShowsDialog ? "mShowsDialog = false: " : "mCreatingDialog = true: ", AnonymousClass007.A0a("getting layout inflater for DialogFragment ", this)));
        }
        return layoutInflater;
    }

    @Override // androidx.fragment.app.Fragment
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    public final DialogC10469Hka requireComponentDialog() {
        Dialog dialogRequireDialog = requireDialog();
        if (dialogRequireDialog instanceof DialogC10469Hka) {
            return (DialogC10469Hka) dialogRequireDialog;
        }
        throw C3cG.A0Q(AnonymousClass006.A0y(dialogRequireDialog, " did not return a ComponentDialog instance from requireDialog(). The actual Dialog is ", C3cG.A0f(this, "DialogFragment ")));
    }

    public DialogFragment(int i) {
        super(i);
        Fragment.A03(this);
    }

    public void show(AbstractC8571FgQ abstractC8571FgQ, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        C8573FgU c8573FgU = new C8573FgU(abstractC8571FgQ);
        c8573FgU.A0G = true;
        c8573FgU.A01(this, str, 0, 1);
        c8573FgU.A03(false, true);
    }
}
