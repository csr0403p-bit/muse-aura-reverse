package androidx.fragment.app;

import X.A6I;
import X.A6O;
import X.AbstractC1720Ap8;
import X.AbstractC5306Dfp;
import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.AbstractC8330Fbx;
import X.AbstractC8519FfS;
import X.AbstractC8541Ffu;
import X.AbstractC8571FgQ;
import X.AbstractC8583Fgi;
import X.AbstractC8595Fgx;
import X.AbstractC8625FhV;
import X.AbstractC8628Fhf;
import X.AbstractC8629Fhg;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.Ao1;
import X.BJt;
import X.BOD;
import X.BRk;
import X.BV4;
import X.BV5;
import X.BV7;
import X.BV8;
import X.BpS;
import X.C10442Hhp;
import X.C10652I0w;
import X.C1HY;
import X.C2934BpC;
import X.C3cG;
import X.C5303Dfm;
import X.C60O;
import X.C7384Etj;
import X.C7VR;
import X.C8287FbB;
import X.C8518FfP;
import X.C8574FgV;
import X.C8576FgZ;
import X.C8577Fgb;
import X.C8589Fgo;
import X.C8594Fgv;
import X.C8600Fh4;
import X.C8621FhR;
import X.C8938Ftu;
import X.C8945Fu1;
import X.C8j3;
import X.DQZ;
import X.DialogInterfaceOnCancelListenerC8299FbP;
import X.DialogInterfaceOnDismissListenerC8300FbQ;
import X.EnumC10573Huf;
import X.EnumC3085Bxl;
import X.EnumC8520FfT;
import X.F2N;
import X.FGI;
import X.FT4;
import X.Hi5;
import X.HiB;
import X.Hmx;
import X.HwU;
import X.Hx6;
import X.I15;
import X.InterfaceC08439ui;
import X.InterfaceC8626Fha;
import X.RunnableC8296FbL;
import X.RunnableC8554Fg7;
import X.RunnableC8605FhA;
import X.RunnableC8606FhB;
import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.savedstate.SavedStateRegistry;
import com.facebook.aura.R;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public class Fragment implements BRk, C1HY, BOD, A6I, ComponentCallbacks, View.OnCreateContextMenuListener {
    public static final int ACTIVITY_CREATED = 4;
    public static final int ATTACHED = 0;
    public static final int AWAITING_ENTER_EFFECTS = 6;
    public static final int AWAITING_EXIT_EFFECTS = 3;
    public static final int CREATED = 1;
    public static final int INITIALIZING = -1;
    public static final int RESUMED = 7;
    public static final int STARTED = 5;
    public static final Object USE_DEFAULT_TRANSITION = C3cG.A0T();
    public static final int VIEW_CREATED = 2;
    public boolean mAdded;
    public C8589Fgo mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    public boolean mBeingSaved;
    public boolean mCalled;
    public AbstractC8571FgQ mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    public int mContentLayoutId;
    public InterfaceC08439ui mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public AbstractC8571FgQ mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public AbstractC8595Fgx<?> mHost;
    public boolean mInDynamicContainer;
    public boolean mInLayout;
    public boolean mIsCreated;
    public Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public C5303Dfm mLifecycleRegistry;
    public EnumC10573Huf mMaxState;
    public boolean mMenuVisible;
    public final AtomicInteger mNextLocalRequestCode;
    public final ArrayList<AbstractC8625FhV> mOnPreAttachedListeners;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public Runnable mPostponedDurationRunnable;
    public Handler mPostponedHandler;
    public String mPreviousWho;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    public final AbstractC8625FhV mSavedStateAttachListener;
    public A6O mSavedStateRegistryController;
    public Boolean mSavedUserVisibleHint;
    public Bundle mSavedViewRegistryState;
    public SparseArray<Parcelable> mSavedViewState;
    public int mState;
    public String mTag;
    public Fragment mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mTransitioning;
    public boolean mUserVisibleHint;
    public View mView;
    public C10442Hhp mViewLifecycleOwner;
    public C2934BpC<C1HY> mViewLifecycleOwnerLiveData;
    public String mWho;

    public class InstantiationException extends RuntimeException {
    }

    public final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new I15(3);
        public final Bundle A00;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.A00);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.A00 = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new C5303Dfm(this, true);
        this.mSavedStateRegistryController = A6O.A00(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        registerOnPreAttachListener(this.mSavedStateAttachListener);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    private <I, O> HwU<I> prepareCallInternal(Hx6<I, O> hx6, BpS<Void, AbstractC8583Fgi> bpS, FT4<O> ft4) {
        if (this.mState > 1) {
            throw BV8.A0m(" is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).", AbstractC7609F5w.A0u(this));
        }
        AtomicReference atomicReference = new AtomicReference();
        registerOnPreAttachListener(new C8594Fgv(ft4, hx6, bpS, this, atomicReference));
        return new Hmx(hx6, this, atomicReference);
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        AbstractC8595Fgx<?> abstractC8595Fgx = this.mHost;
        if (abstractC8595Fgx == null || abstractC8595Fgx.A00 == null) {
            return;
        }
        this.mCalled = false;
        this.mCalled = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public void onCreate(Bundle bundle) throws IOException {
        this.mCalled = true;
        restoreChildFragmentState();
        AbstractC8571FgQ abstractC8571FgQ = this.mChildFragmentManager;
        if (abstractC8571FgQ.A00 < 1) {
            AbstractC8571FgQ.A0C(abstractC8571FgQ);
            AbstractC8571FgQ.A0G(abstractC8571FgQ, 1);
        }
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        AbstractC8595Fgx<?> abstractC8595Fgx = this.mHost;
        if (abstractC8595Fgx == null || abstractC8595Fgx.A00 == null) {
            return;
        }
        this.mCalled = false;
        this.mCalled = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw A02(" did not call through to super.onDetach()", AbstractC7609F5w.A0u(this));
        }
        AbstractC8571FgQ abstractC8571FgQ = this.mChildFragmentManager;
        if (abstractC8571FgQ.A0F) {
            return;
        }
        abstractC8571FgQ.A0a();
        this.mChildFragmentManager = new C8621FhR();
    }

    public final <I, O> HwU<I> registerForActivityResult(Hx6<I, O> hx6, FT4<O> ft4) {
        return prepareCallInternal(hx6, new C10652I0w(this, 0), ft4);
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2 = intent;
        if (this.mHost == null) {
            throw BV8.A0m(" not attached to Activity", C3cG.A0f(this, "Fragment "));
        }
        if (AbstractC8571FgQ.A0N(2)) {
            StringBuilder sbA0f = C3cG.A0f(this, "Fragment ");
            sbA0f.append(" received the following in startIntentSenderForResult() requestCode: ");
            sbA0f.append(i);
            sbA0f.append(" IntentSender: ");
            sbA0f.append(intentSender);
            sbA0f.append(" fillInIntent: ");
            sbA0f.append(intent);
            AbstractC7607F5u.A1N(AnonymousClass006.A0y(bundle, " options: ", sbA0f));
        }
        AbstractC8571FgQ parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.A04 == null) {
            AbstractC8595Fgx<?> abstractC8595Fgx = parentFragmentManager.A09;
            C7384Etj.A0Y(intentSender, 1);
            if (i != -1) {
                throw C3cG.A0Q("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            Activity activity = abstractC8595Fgx.A00;
            if (activity == null) {
                throw C3cG.A0Q("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            activity.startIntentSenderForResult(intentSender, -1, intent2, i2, i3, i4, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (AbstractC8571FgQ.A0N(2)) {
                StringBuilder sbA0f2 = C3cG.A0f(bundle, "ActivityOptions ");
                sbA0f2.append(" were added to fillInIntent ");
                sbA0f2.append(intent2);
                AbstractC7610F5x.A1M(this, " for fragment ", sbA0f2);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        C7384Etj.A0Y(intentSender, 0);
        IntentSenderRequest intentSenderRequest = new IntentSenderRequest(intent2, intentSender, i2, i3);
        String str = this.mWho;
        FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = new FragmentManager$LaunchedFragmentInfo();
        fragmentManager$LaunchedFragmentInfo.A01 = str;
        fragmentManager$LaunchedFragmentInfo.A00 = i;
        parentFragmentManager.A0C.addLast(fragmentManager$LaunchedFragmentInfo);
        if (AbstractC8571FgQ.A0N(2)) {
            AbstractC7609F5w.A1N(C3cG.A0f(this, "Fragment "), "is launching an IntentSender for result ");
        }
        parentFragmentManager.A04.A01(null, intentSenderRequest);
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public static void A03(DialogFragment dialogFragment) {
        dialogFragment.mDismissRunnable = new RunnableC8296FbL(dialogFragment);
        dialogFragment.mOnCancelListener = new DialogInterfaceOnCancelListenerC8299FbP(dialogFragment);
        dialogFragment.mOnDismissListener = new DialogInterfaceOnDismissListenerC8300FbQ(dialogFragment);
        dialogFragment.mStyle = 0;
        dialogFragment.mTheme = 0;
        dialogFragment.mCancelable = true;
        dialogFragment.mShowsDialog = true;
        dialogFragment.mBackStackId = -1;
        dialogFragment.mObserver = new C8938Ftu(dialogFragment, 9);
        dialogFragment.mDialogCreated = false;
    }

    public static void A04(C1HY c1hy, AbstractC5306Dfp abstractC5306Dfp, int i) {
        abstractC5306Dfp.A05(c1hy, new C8938Ftu(c1hy, i));
    }

    private C8589Fgo ensureAnimationInfo() {
        C8589Fgo c8589Fgo = this.mAnimationInfo;
        if (c8589Fgo != null) {
            return c8589Fgo;
        }
        C8589Fgo c8589Fgo2 = new C8589Fgo();
        this.mAnimationInfo = c8589Fgo2;
        return c8589Fgo2;
    }

    private int getMinimumMaxLifecycleState() {
        Fragment fragment;
        EnumC10573Huf enumC10573Huf = this.mMaxState;
        return (enumC10573Huf == EnumC10573Huf.A04 || (fragment = this.mParentFragment) == null) ? enumC10573Huf.ordinal() : Math.min(enumC10573Huf.ordinal(), fragment.getMinimumMaxLifecycleState());
    }

    private void registerOnPreAttachListener(AbstractC8625FhV abstractC8625FhV) {
        if (this.mState >= 0) {
            abstractC8625FhV.A00();
        } else {
            this.mOnPreAttachedListeners.add(abstractC8625FhV);
        }
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        AbstractC8571FgQ abstractC8571FgQ;
        C8589Fgo c8589Fgo = this.mAnimationInfo;
        if (c8589Fgo != null) {
            c8589Fgo.A0J = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (abstractC8571FgQ = this.mFragmentManager) == null) {
            return;
        }
        AbstractC8541Ffu abstractC8541FfuA02 = AbstractC8541Ffu.A02(viewGroup, abstractC8571FgQ);
        abstractC8541FfuA02.A0A();
        if (z) {
            this.mHost.A02.post(new RunnableC8554Fg7(this, abstractC8541FfuA02));
        } else {
            abstractC8541FfuA02.A08();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    public AbstractC8330Fbx createFragmentContainer() {
        return new C8287FbB(this);
    }

    public Fragment findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.A0U.A01(str);
    }

    public String generateActivityResultKey() {
        return FGI.A0V("fragment_", this.mWho, "_rq#", this.mNextLocalRequestCode.getAndIncrement());
    }

    public final FragmentActivity getActivity() {
        AbstractC8595Fgx<?> abstractC8595Fgx = this.mHost;
        if (abstractC8595Fgx == null) {
            return null;
        }
        return (FragmentActivity) abstractC8595Fgx.A00;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C8589Fgo c8589Fgo = this.mAnimationInfo;
        if (c8589Fgo == null || (bool = c8589Fgo.A09) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C8589Fgo c8589Fgo = this.mAnimationInfo;
        if (c8589Fgo == null || (bool = c8589Fgo.A0A) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final AbstractC8571FgQ getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw BV8.A0m(" has not been attached yet.", AbstractC7609F5w.A0u(this));
    }

    public Context getContext() {
        AbstractC8595Fgx<?> abstractC8595Fgx = this.mHost;
        if (abstractC8595Fgx == null) {
            return null;
        }
        return abstractC8595Fgx.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
    
        if (X.AbstractC8571FgQ.A0M() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        r1 = X.C60O.A0x("Could not find Application instance from Context ");
        r1.append(requireContext().getApplicationContext());
        X.AbstractC7607F5u.A1O(X.AnonymousClass001.A0v(", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory", r1));
     */
    @Override // X.BRk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.InterfaceC08439ui getDefaultViewModelProviderFactory() {
        /*
            r3 = this;
            X.FgQ r0 = r3.mFragmentManager
            if (r0 == 0) goto L4f
            X.9ui r1 = r3.mDefaultFactory
            if (r1 != 0) goto L45
            android.content.Context r0 = r3.requireContext()
            android.content.Context r2 = r0.getApplicationContext()
        L10:
            boolean r0 = r2 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L4d
            boolean r0 = r2 instanceof android.app.Application
            if (r0 == 0) goto L46
            android.app.Application r2 = (android.app.Application) r2
            if (r2 != 0) goto L3c
        L1c:
            boolean r0 = X.AbstractC8571FgQ.A0M()
            if (r0 == 0) goto L3c
            java.lang.String r0 = "Could not find Application instance from Context "
            java.lang.StringBuilder r1 = X.C60O.A0x(r0)
            android.content.Context r0 = r3.requireContext()
            android.content.Context r0 = r0.getApplicationContext()
            r1.append(r0)
            java.lang.String r0 = ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory"
            java.lang.String r0 = X.AnonymousClass001.A0v(r0, r1)
            X.AbstractC7607F5u.A1O(r0)
        L3c:
            android.os.Bundle r0 = r3.mArguments
            X.A6X r1 = new X.A6X
            r1.<init>(r2, r0, r3)
            r3.mDefaultFactory = r1
        L45:
            return r1
        L46:
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            goto L10
        L4d:
            r2 = 0
            goto L1c
        L4f:
            java.lang.String r0 = "Can't access ViewModels from detached fragment"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.getDefaultViewModelProviderFactory():X.9ui");
    }

    public int getEnterAnim() {
        C8589Fgo c8589Fgo = this.mAnimationInfo;
        if (c8589Fgo == null) {
            return 0;
        }
        return c8589Fgo.A01;
    }

    public Object getEnterTransition() {
        C8589Fgo c8589Fgo = this.mAnimationInfo;
        if (c8589Fgo == null) {
            return null;
        }
        return c8589Fgo.A0B;
    }

    public AbstractC8629Fhg getEnterTransitionCallback() {
        return null;
    }

    public int getExitAnim() {
        C8589Fgo c8589Fgo = this.mAnimationInfo;
        if (c8589Fgo == null) {
            return 0;
        }
        return c8589Fgo.A02;
    }

    public Object getExitTransition() {
        C8589Fgo c8589Fgo = this.mAnimationInfo;
        if (c8589Fgo == null) {
            return null;
        }
        return c8589Fgo.A0C;
    }

    public AbstractC8629Fhg getExitTransitionCallback() {
        return null;
    }

    public View getFocusedView() {
        C8589Fgo c8589Fgo = this.mAnimationInfo;
        if (c8589Fgo == null) {
            return null;
        }
        return c8589Fgo.A06;
    }

    @Deprecated
    public final AbstractC8571FgQ getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        AbstractC8595Fgx<?> abstractC8595Fgx = this.mHost;
        if (abstractC8595Fgx == null) {
            return null;
        }
        return ((C8576FgZ) abstractC8595Fgx).A00;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(null);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // X.C1HY
    public F2N getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public int getNextTransition() {
        C8589Fgo c8589Fgo = this.mAnimationInfo;
        if (c8589Fgo == null) {
            return 0;
        }
        return c8589Fgo.A03;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final AbstractC8571FgQ getParentFragmentManager() {
        AbstractC8571FgQ abstractC8571FgQ = this.mFragmentManager;
        if (abstractC8571FgQ != null) {
            return abstractC8571FgQ;
        }
        throw BV8.A0m(" not associated with a fragment manager.", AbstractC7609F5w.A0u(this));
    }

    public boolean getPopDirection() {
        C8589Fgo c8589Fgo = this.mAnimationInfo;
        if (c8589Fgo == null) {
            return false;
        }
        return c8589Fgo.A0K;
    }

    public int getPopEnterAnim() {
        C8589Fgo c8589Fgo = this.mAnimationInfo;
        if (c8589Fgo == null) {
            return 0;
        }
        return c8589Fgo.A04;
    }

    public int getPopExitAnim() {
        C8589Fgo c8589Fgo = this.mAnimationInfo;
        if (c8589Fgo == null) {
            return 0;
        }
        return c8589Fgo.A05;
    }

    public float getPostOnViewCreatedAlpha() {
        C8589Fgo c8589Fgo = this.mAnimationInfo;
        if (c8589Fgo == null) {
            return 1.0f;
        }
        return c8589Fgo.A00;
    }

    public Object getReenterTransition() {
        C8589Fgo c8589Fgo = this.mAnimationInfo;
        if (c8589Fgo == null) {
            return null;
        }
        Object obj = c8589Fgo.A0D;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    @Deprecated
    public final boolean getRetainInstance() {
        Hi5 hi5 = AbstractC8519FfS.A00;
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(this, AnonymousClass007.A0a("Attempting to get retain instance for fragment ", this));
        AbstractC8519FfS.A02(getRetainInstanceUsageViolation);
        Hi5 hi5A00 = AbstractC8519FfS.A00(this);
        AbstractC7611F5y.A0k(hi5A00, getRetainInstanceUsageViolation, EnumC8520FfT.DETECT_RETAIN_INSTANCE_USAGE, this, hi5A00.A01);
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        C8589Fgo c8589Fgo = this.mAnimationInfo;
        if (c8589Fgo == null) {
            return null;
        }
        Object obj = c8589Fgo.A0E;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // X.A6I
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.A00;
    }

    public Object getSharedElementEnterTransition() {
        C8589Fgo c8589Fgo = this.mAnimationInfo;
        if (c8589Fgo == null) {
            return null;
        }
        return c8589Fgo.A0F;
    }

    public Object getSharedElementReturnTransition() {
        C8589Fgo c8589Fgo = this.mAnimationInfo;
        if (c8589Fgo == null) {
            return null;
        }
        Object obj = c8589Fgo.A0G;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        C8589Fgo c8589Fgo = this.mAnimationInfo;
        return (c8589Fgo == null || (arrayList = c8589Fgo.A0H) == null) ? C3cG.A0h() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        C8589Fgo c8589Fgo = this.mAnimationInfo;
        return (c8589Fgo == null || (arrayList = c8589Fgo.A0I) == null) ? C3cG.A0h() : arrayList;
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final int getTargetRequestCode() {
        Hi5 hi5 = AbstractC8519FfS.A00;
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(this, AnonymousClass007.A0a("Attempting to get target request code from fragment ", this));
        AbstractC8519FfS.A02(getTargetFragmentRequestCodeUsageViolation);
        Hi5 hi5A00 = AbstractC8519FfS.A00(this);
        AbstractC7611F5y.A0k(hi5A00, getTargetFragmentRequestCodeUsageViolation, EnumC8520FfT.DETECT_TARGET_FRAGMENT_USAGE, this, hi5A00.A01);
        return this.mTargetRequestCode;
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public C1HY getViewLifecycleOwner() {
        C10442Hhp c10442Hhp = this.mViewLifecycleOwner;
        if (c10442Hhp != null) {
            return c10442Hhp;
        }
        throw BV8.A0m(" when getView() is null i.e., before onCreateView() or after onDestroyView()", C3cG.A0f(this, "Can't access the Fragment View's LifecycleOwner for "));
    }

    public AbstractC5306Dfp<C1HY> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // X.BOD
    public BJt getViewModelStore() {
        AbstractC8571FgQ abstractC8571FgQ = this.mFragmentManager;
        if (abstractC8571FgQ == null) {
            throw C3cG.A0Q("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() == 1) {
            throw C3cG.A0Q("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap<String, BJt> map = abstractC8571FgQ.A0A.A04;
        BJt bJt = map.get(this.mWho);
        if (bJt != null) {
            return bJt;
        }
        BJt bJt2 = new BJt();
        map.put(this.mWho, bJt2);
        return bJt2;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        Fragment fragment;
        if (this.mHidden) {
            return true;
        }
        return (this.mFragmentManager == null || (fragment = this.mParentFragment) == null || !fragment.isHidden()) ? false : true;
    }

    public final boolean isInBackStack() {
        return AnonymousClass002.A1N(this.mBackStackNesting);
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        Fragment fragment;
        if (this.mMenuVisible) {
            return this.mFragmentManager == null || (fragment = this.mParentFragment) == null || fragment.isMenuVisible();
        }
        return false;
    }

    public boolean isPostponed() {
        C8589Fgo c8589Fgo = this.mAnimationInfo;
        if (c8589Fgo == null) {
            return false;
        }
        return c8589Fgo.A0J;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return BV5.A1P(this.mState, 7);
    }

    public final boolean isStateSaved() {
        AbstractC8571FgQ abstractC8571FgQ = this.mFragmentManager;
        if (abstractC8571FgQ == null) {
            return false;
        }
        return abstractC8571FgQ.A0J || abstractC8571FgQ.A0K;
    }

    /* renamed from: lambda$performCreateView$0$androidx-fragment-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m47lambda$performCreateView$0$androidxfragmentappFragment() {
        C10442Hhp c10442Hhp = this.mViewLifecycleOwner;
        c10442Hhp.A01.A01(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.A0c();
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.A0c();
        this.mState = 3;
        this.mCalled = false;
        this.mCalled = true;
        restoreViewState();
        AbstractC8571FgQ abstractC8571FgQ = this.mChildFragmentManager;
        AbstractC8571FgQ.A0C(abstractC8571FgQ);
        AbstractC8571FgQ.A0G(abstractC8571FgQ, 4);
    }

    public void performAttach() throws IOException {
        Iterator<AbstractC8625FhV> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().A00();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.A0l(this, createFragmentContainer(), this.mHost);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.A01);
        if (!this.mCalled) {
            throw A02(" did not call through to super.onAttach()", AbstractC7609F5w.A0u(this));
        }
        Iterator<InterfaceC8626Fha> it2 = this.mFragmentManager.A0X.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        AbstractC8571FgQ abstractC8571FgQ = this.mChildFragmentManager;
        AbstractC8571FgQ.A0C(abstractC8571FgQ);
        AbstractC8571FgQ.A0G(abstractC8571FgQ, 0);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        AbstractC8571FgQ abstractC8571FgQ = this.mChildFragmentManager;
        if (abstractC8571FgQ.A00 < 1) {
            return false;
        }
        Iterator itA04 = AbstractC8571FgQ.A04(abstractC8571FgQ);
        while (itA04.hasNext()) {
            Fragment fragment = (Fragment) itA04.next();
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void performCreate(Bundle bundle) throws IOException {
        this.mChildFragmentManager.A0c();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.A04(new C8945Fu1(this));
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw A02(" did not call through to super.onCreate()", AbstractC7609F5w.A0u(this));
        }
        this.mLifecycleRegistry.A06(EnumC3085Bxl.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
        }
        return this.mChildFragmentManager.A0u(menu, menuInflater) | z;
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.A0c();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C10442Hhp(this, getViewModelStore(), new Runnable() { // from class: X.FhO
            public static final String __redex_internal_original_name = "Fragment$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                this.A00.m47lambda$performCreateView$0$androidxfragmentappFragment();
            }
        });
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        C10442Hhp c10442Hhp = this.mViewLifecycleOwner;
        if (viewOnCreateView == null) {
            if (c10442Hhp.A00 != null) {
                throw C3cG.A0Q("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        c10442Hhp.A00();
        if (AbstractC8571FgQ.A0M()) {
            StringBuilder sbA0x = C60O.A0x("Setting ViewLifecycleOwner on View ");
            sbA0x.append(this.mView);
            AbstractC7607F5u.A1O(AnonymousClass006.A0y(this, " for Fragment ", sbA0x));
        }
        AbstractC1720Ap8.A01(this.mView, this.mViewLifecycleOwner);
        View view = this.mView;
        C10442Hhp c10442Hhp2 = this.mViewLifecycleOwner;
        C7384Etj.A0Y(view, 0);
        view.setTag(R.id.view_tree_view_model_store_owner, c10442Hhp2);
        View view2 = this.mView;
        C10442Hhp c10442Hhp3 = this.mViewLifecycleOwner;
        C7384Etj.A0Y(view2, 0);
        view2.setTag(R.id.view_tree_saved_state_registry_owner, c10442Hhp3);
        this.mViewLifecycleOwnerLiveData.A0A(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.A0a();
        this.mLifecycleRegistry.A06(EnumC3085Bxl.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw A02(" did not call through to super.onDestroy()", AbstractC7609F5w.A0u(this));
        }
    }

    public void performDestroyView() {
        AbstractC8571FgQ.A0G(this.mChildFragmentManager, 1);
        if (this.mView != null) {
            C10442Hhp c10442Hhp = this.mViewLifecycleOwner;
            c10442Hhp.A00();
            if (c10442Hhp.A00.A01.A00(EnumC10573Huf.A02)) {
                C10442Hhp c10442Hhp2 = this.mViewLifecycleOwner;
                c10442Hhp2.A00.A06(EnumC3085Bxl.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw A02(" did not call through to super.onDestroyView()", AbstractC7609F5w.A0u(this));
        }
        Ao1 ao1 = new C8577Fgb(this, getViewModelStore()).A01.A00;
        if (0 < ao1.A00) {
            ao1.A02(0);
            throw BV4.A0a("markForRedelivery");
        }
        this.mPerformedCreateView = false;
    }

    public void performMultiWindowModeChanged(boolean z) {
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        return this.mChildFragmentManager.A0v(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        this.mChildFragmentManager.A0f(menu);
    }

    public void performPause() {
        AbstractC8571FgQ.A0G(this.mChildFragmentManager, 5);
        if (this.mView != null) {
            C10442Hhp c10442Hhp = this.mViewLifecycleOwner;
            c10442Hhp.A00.A06(EnumC3085Bxl.ON_PAUSE);
        }
        this.mLifecycleRegistry.A06(EnumC3085Bxl.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw A02(" did not call through to super.onPause()", AbstractC7609F5w.A0u(this));
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
        }
        return this.mChildFragmentManager.A0t(menu) | z;
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean zA0w = this.mFragmentManager.A0w(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zA0w) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zA0w);
            AbstractC8571FgQ abstractC8571FgQ = this.mChildFragmentManager;
            AbstractC8571FgQ.A0F(abstractC8571FgQ);
            AbstractC8571FgQ.A0A(abstractC8571FgQ.A07, abstractC8571FgQ);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.A0c();
        this.mChildFragmentManager.A0s(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw A02(" did not call through to super.onResume()", AbstractC7609F5w.A0u(this));
        }
        C5303Dfm c5303Dfm = this.mLifecycleRegistry;
        EnumC3085Bxl enumC3085Bxl = EnumC3085Bxl.ON_RESUME;
        c5303Dfm.A06(enumC3085Bxl);
        if (this.mView != null) {
            this.mViewLifecycleOwner.A00.A06(enumC3085Bxl);
        }
        AbstractC8571FgQ abstractC8571FgQ = this.mChildFragmentManager;
        AbstractC8571FgQ.A0C(abstractC8571FgQ);
        AbstractC8571FgQ.A0G(abstractC8571FgQ, 7);
    }

    public void performStart() {
        this.mChildFragmentManager.A0c();
        this.mChildFragmentManager.A0s(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw A02(" did not call through to super.onStart()", AbstractC7609F5w.A0u(this));
        }
        C5303Dfm c5303Dfm = this.mLifecycleRegistry;
        EnumC3085Bxl enumC3085Bxl = EnumC3085Bxl.ON_START;
        c5303Dfm.A06(enumC3085Bxl);
        if (this.mView != null) {
            this.mViewLifecycleOwner.A00.A06(enumC3085Bxl);
        }
        AbstractC8571FgQ abstractC8571FgQ = this.mChildFragmentManager;
        AbstractC8571FgQ.A0C(abstractC8571FgQ);
        AbstractC8571FgQ.A0G(abstractC8571FgQ, 5);
    }

    public void performStop() {
        AbstractC8571FgQ abstractC8571FgQ = this.mChildFragmentManager;
        abstractC8571FgQ.A0K = true;
        abstractC8571FgQ.A0A.A01 = true;
        AbstractC8571FgQ.A0G(abstractC8571FgQ, 4);
        if (this.mView != null) {
            C10442Hhp c10442Hhp = this.mViewLifecycleOwner;
            c10442Hhp.A00.A06(EnumC3085Bxl.ON_STOP);
        }
        this.mLifecycleRegistry.A06(EnumC3085Bxl.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw A02(" did not call through to super.onStop()", AbstractC7609F5w.A0u(this));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        AbstractC8571FgQ.A0G(this.mChildFragmentManager, 2);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i) {
        if (this.mHost == null) {
            throw BV8.A0m(" not attached to Activity", AbstractC7609F5w.A0u(this));
        }
        AbstractC8571FgQ parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.A02 != null) {
            String str = this.mWho;
            FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = new FragmentManager$LaunchedFragmentInfo();
            fragmentManager$LaunchedFragmentInfo.A01 = str;
            fragmentManager$LaunchedFragmentInfo.A00 = i;
            parentFragmentManager.A0C.addLast(fragmentManager$LaunchedFragmentInfo);
            parentFragmentManager.A02.A01(null, strArr);
        }
    }

    public final Bundle requireArguments() {
        Bundle bundle = this.mArguments;
        if (bundle != null) {
            return bundle;
        }
        throw BV8.A0m(" does not have any arguments.", AbstractC7609F5w.A0u(this));
    }

    public final Fragment requireParentFragment() {
        Fragment fragment = this.mParentFragment;
        if (fragment != null) {
            return fragment;
        }
        Context context = getContext();
        StringBuilder sbA0x = C60O.A0x("Fragment ");
        if (context == null) {
            sbA0x.append(this);
            throw BV8.A0m(" is not attached to any Fragment or host", sbA0x);
        }
        sbA0x.append(this);
        sbA0x.append(" is not a child Fragment, it is directly attached to ");
        throw C3cG.A0Q(C8j3.A14(getContext(), sbA0x));
    }

    public final View requireView() {
        View view = this.mView;
        if (view != null) {
            return view;
        }
        throw BV8.A0m(" did not return a View from onCreateView() or this was called before onCreateView().", AbstractC7609F5w.A0u(this));
    }

    public void restoreChildFragmentState() throws IOException {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.A0e(bundle);
        AbstractC8571FgQ abstractC8571FgQ = this.mChildFragmentManager;
        AbstractC8571FgQ.A0C(abstractC8571FgQ);
        AbstractC8571FgQ.A0G(abstractC8571FgQ, 1);
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        ensureAnimationInfo().A01 = i;
        ensureAnimationInfo().A02 = i2;
        ensureAnimationInfo().A04 = i3;
        ensureAnimationInfo().A05 = i4;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw C3cG.A0Q("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            ((C8576FgZ) this.mHost).A00.invalidateOptionsMenu();
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw C3cG.A0Q("Fragment already added");
        }
        if (savedState == null || (bundle = savedState.A00) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                ((C8576FgZ) this.mHost).A00.invalidateOptionsMenu();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.A03 = i;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo != null) {
            ensureAnimationInfo().A0K = z;
        }
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        Hi5 hi5 = AbstractC8519FfS.A00;
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(this, AnonymousClass007.A0a("Attempting to set retain instance for fragment ", this));
        AbstractC8519FfS.A02(setRetainInstanceUsageViolation);
        Hi5 hi5A00 = AbstractC8519FfS.A00(this);
        AbstractC7611F5y.A0k(hi5A00, setRetainInstanceUsageViolation, EnumC8520FfT.DETECT_RETAIN_INSTANCE_USAGE, this, hi5A00.A01);
        this.mRetainInstance = z;
        AbstractC8571FgQ abstractC8571FgQ = this.mFragmentManager;
        if (abstractC8571FgQ == null) {
            this.mRetainInstanceChangedWhileDetached = true;
            return;
        }
        C8574FgV c8574FgV = abstractC8571FgQ.A0A;
        if (z) {
            c8574FgV.A04(this);
        } else {
            c8574FgV.A05(this);
        }
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i) {
        if (fragment != null) {
            Hi5 hi5 = AbstractC8519FfS.A00;
            SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(this, fragment, i);
            AbstractC8519FfS.A02(setTargetFragmentUsageViolation);
            Hi5 hi5A00 = AbstractC8519FfS.A00(this);
            AbstractC7611F5y.A0k(hi5A00, setTargetFragmentUsageViolation, EnumC8520FfT.DETECT_TARGET_FRAGMENT_USAGE, this, hi5A00.A01);
        }
        AbstractC8571FgQ abstractC8571FgQ = this.mFragmentManager;
        AbstractC8571FgQ abstractC8571FgQ2 = fragment != null ? fragment.mFragmentManager : null;
        if (abstractC8571FgQ != null && abstractC8571FgQ2 != null && abstractC8571FgQ != abstractC8571FgQ2) {
            throw C8j3.A0w(" must share the same FragmentManager to be set as a target fragment", AbstractC7609F5w.A0u(fragment));
        }
        for (Fragment targetFragment = fragment; targetFragment != null; targetFragment = targetFragment.getTargetFragment(false)) {
            if (targetFragment.equals(this)) {
                StringBuilder sbA0f = C3cG.A0f(fragment, "Setting ");
                sbA0f.append(" as the target of ");
                sbA0f.append(this);
                throw C8j3.A0w(" would create a target cycle", sbA0f);
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setUserVisibleHint(boolean r6) {
        /*
            r5 = this;
            X.Hi5 r0 = X.AbstractC8519FfS.A00
            androidx.fragment.app.strictmode.SetUserVisibleHintViolation r3 = new androidx.fragment.app.strictmode.SetUserVisibleHintViolation
            r3.<init>(r5, r6)
            X.AbstractC8519FfS.A02(r3)
            X.Hi5 r2 = X.AbstractC8519FfS.A00(r5)
            java.util.Set<X.FfT> r1 = r2.A01
            X.FfT r0 = X.EnumC8520FfT.DETECT_SET_USER_VISIBLE_HINT
            X.AbstractC7611F5y.A0k(r2, r3, r0, r5, r1)
            boolean r0 = r5.mUserVisibleHint
            r4 = 5
            if (r0 != 0) goto L3f
            if (r6 == 0) goto L3f
            int r0 = r5.mState
            if (r0 >= r4) goto L3f
            X.FgQ r3 = r5.mFragmentManager
            if (r3 == 0) goto L3f
            boolean r0 = r5.isAdded()
            if (r0 == 0) goto L3f
            boolean r0 = r5.mIsCreated
            if (r0 == 0) goto L3f
            X.FgR r2 = r3.A0X(r5)
            androidx.fragment.app.Fragment r1 = r2.A02
            boolean r0 = r1.mDeferStart
            if (r0 == 0) goto L3f
            boolean r0 = r3.mExecutingActions
            if (r0 == 0) goto L56
            r0 = 1
            r3.A0H = r0
        L3f:
            r5.mUserVisibleHint = r6
            int r0 = r5.mState
            if (r0 >= r4) goto L48
            r0 = 1
            if (r6 == 0) goto L49
        L48:
            r0 = 0
        L49:
            r5.mDeferStart = r0
            android.os.Bundle r0 = r5.mSavedFragmentState
            if (r0 == 0) goto L55
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r5.mSavedUserVisibleHint = r0
        L55:
            return
        L56:
            r0 = 0
            r1.mDeferStart = r0
            r2.A04()
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.setUserVisibleHint(boolean):void");
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        AbstractC8595Fgx<?> abstractC8595Fgx = this.mHost;
        if (abstractC8595Fgx != null) {
            return C7VR.A01(((C8576FgZ) abstractC8595Fgx).A00, str);
        }
        return false;
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().A0J) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().A0J = false;
        } else if (Looper.myLooper() != this.mHost.A02.getLooper()) {
            this.mHost.A02.postAtFrontOfQueue(new RunnableC8606FhB(this));
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sbA0p = BV4.A0p(128);
        AbstractC7609F5w.A1L(sbA0p, this);
        sbA0p.append("{");
        AbstractC7609F5w.A1K(sbA0p, this);
        sbA0p.append("} (");
        sbA0p.append(this.mWho);
        int i = this.mFragmentId;
        if (i != 0) {
            sbA0p.append(" id=0x");
            BV4.A1N(sbA0p, i);
        }
        String str = this.mTag;
        if (str != null) {
            sbA0p.append(" tag=");
            sbA0p.append(str);
        }
        return BV7.A10(sbA0p);
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = AnonymousClass002.A0k();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new C8621FhR();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new RunnableC8605FhA(this);
        this.mMaxState = EnumC10573Huf.A05;
        this.mViewLifecycleOwnerLiveData = new C2934BpC<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = C3cG.A0h();
        this.mSavedStateAttachListener = new HiB(this);
        initLifecycle();
    }

    public static SuperNotCalledException A02(String str, StringBuilder sb) {
        sb.append(str);
        return new SuperNotCalledException(sb.toString());
    }

    private void restoreViewState() {
        if (AbstractC8571FgQ.A0M()) {
            AbstractC7607F5u.A1O(AnonymousClass007.A0a("moveto RESTORE_VIEW_STATE: ", this));
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        AbstractC7608F5v.A1H(printWriter, this.mFragmentId);
        printWriter.print(" mContainerId=#");
        AbstractC7608F5v.A1H(printWriter, this.mContainerId);
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getContext() != null) {
            new C8577Fgb(this, getViewModelStore()).A00(printWriter, str);
        }
        printWriter.print(str);
        StringBuilder sbA0x = C60O.A0x("Child ");
        sbA0x.append(this.mChildFragmentManager);
        printWriter.println(AnonymousClass001.A0v(":", sbA0x));
        this.mChildFragmentManager.A0r(FGI.A0M(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        r1 = X.C60O.A0x("Could not find Application instance from Context ");
        r1.append(requireContext().getApplicationContext());
        X.AbstractC7607F5u.A1O(X.AnonymousClass001.A0v(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory", r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (X.AbstractC8571FgQ.A0M() == false) goto L11;
     */
    @Override // X.BRk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.A6J getDefaultViewModelCreationExtras() {
        /*
            r4 = this;
            android.content.Context r0 = r4.requireContext()
            android.content.Context r3 = r0.getApplicationContext()
        L8:
            boolean r0 = r3 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L59
            boolean r0 = r3 instanceof android.app.Application
            if (r0 == 0) goto L52
            if (r3 != 0) goto L32
        L12:
            boolean r0 = X.AbstractC8571FgQ.A0M()
            if (r0 == 0) goto L32
            java.lang.String r0 = "Could not find Application instance from Context "
            java.lang.StringBuilder r1 = X.C60O.A0x(r0)
            android.content.Context r0 = r4.requireContext()
            android.content.Context r0 = r0.getApplicationContext()
            r1.append(r0)
            java.lang.String r0 = ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory"
            java.lang.String r0 = X.AnonymousClass001.A0v(r0, r1)
            X.AbstractC7607F5u.A1O(r0)
        L32:
            X.A6d r2 = new X.A6d
            r2.<init>()
            if (r3 == 0) goto L3e
            X.BNw<android.app.Application> r0 = X.A6Y.A02
            r2.A01(r0, r3)
        L3e:
            X.BNw<X.A6I> r0 = X.A6H.A01
            r2.A01(r0, r4)
            X.BNw<X.BOD> r0 = X.A6H.A02
            r2.A01(r0, r4)
            android.os.Bundle r1 = r4.mArguments
            if (r1 == 0) goto L51
            X.BNw<android.os.Bundle> r0 = X.A6H.A00
            r2.A01(r0, r1)
        L51:
            return r2
        L52:
            android.content.ContextWrapper r3 = (android.content.ContextWrapper) r3
            android.content.Context r3 = r3.getBaseContext()
            goto L8
        L59:
            r3 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.getDefaultViewModelCreationExtras():X.A6J");
    }

    @Deprecated
    public AbstractC8628Fhf getLoaderManager() {
        return new C8577Fgb(this, getViewModelStore());
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    public final String getString(int i) {
        return requireContext().getResources().getString(i);
    }

    public final CharSequence getText(int i) {
        return requireContext().getResources().getText(i);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = AnonymousClass002.A0k();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new C8621FhR();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (AbstractC8571FgQ.A0L()) {
            StringBuilder sbA0u = AbstractC7609F5w.A0u(this);
            sbA0u.append(" received the following in onActivityResult(): requestCode: ");
            sbA0u.append(i);
            sbA0u.append(" resultCode: ");
            sbA0u.append(i2);
            AbstractC7607F5u.A1N(AnonymousClass006.A0y(intent, " data: ", sbA0u));
        }
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().A0J = true;
    }

    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw BV8.A0m(" not attached to an activity.", AbstractC7609F5w.A0u(this));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw BV8.A0m(" not attached to a context.", AbstractC7609F5w.A0u(this));
    }

    @Deprecated
    public final AbstractC8571FgQ requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw BV8.A0m(" not attached to a host.", AbstractC7609F5w.A0u(this));
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().A09 = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().A0A = Boolean.valueOf(z);
    }

    public void setEnterSharedElementCallback(AbstractC8629Fhg abstractC8629Fhg) {
        ensureAnimationInfo().A07 = abstractC8629Fhg;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().A0B = obj;
    }

    public void setExitSharedElementCallback(AbstractC8629Fhg abstractC8629Fhg) {
        ensureAnimationInfo().A08 = abstractC8629Fhg;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().A0C = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().A06 = view;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        ensureAnimationInfo().A00 = f;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().A0D = obj;
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().A0E = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().A0F = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        C8589Fgo c8589Fgo = this.mAnimationInfo;
        c8589Fgo.A0H = arrayList;
        c8589Fgo.A0I = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().A0G = obj;
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public Fragment(int i) {
        this();
        this.mContentLayoutId = i;
    }

    private Fragment getTargetFragment(boolean z) {
        String str;
        if (z) {
            Hi5 hi5 = AbstractC8519FfS.A00;
            GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(this, AnonymousClass007.A0a("Attempting to get target fragment from fragment ", this));
            AbstractC8519FfS.A02(getTargetFragmentUsageViolation);
            Hi5 hi5A00 = AbstractC8519FfS.A00(this);
            AbstractC7611F5y.A0k(hi5A00, getTargetFragmentUsageViolation, EnumC8520FfT.DETECT_TARGET_FRAGMENT_USAGE, this, hi5A00.A01);
        }
        Fragment fragment = this.mTarget;
        if (fragment == null) {
            AbstractC8571FgQ abstractC8571FgQ = this.mFragmentManager;
            if (abstractC8571FgQ != null && (str = this.mTargetWho) != null) {
                return abstractC8571FgQ.A0U.A00(str);
            }
            return null;
        }
        return fragment;
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) throws ClassNotFoundException {
        try {
            ClassLoader classLoader = context.getClassLoader();
            try {
                DQZ<ClassLoader, DQZ<String, Class<?>>> dqz = C8518FfP.A01;
                DQZ<String, Class<?>> dqz2 = dqz.get(classLoader);
                if (dqz2 == null) {
                    dqz2 = new DQZ<>(0);
                    dqz.put(classLoader, dqz2);
                }
                Class<?> cls = dqz2.get(str);
                if (cls == null) {
                    cls = Class.forName(str, false, classLoader);
                    dqz2.put(str, cls);
                }
                Fragment fragment = (Fragment) cls.getConstructor(null).newInstance(null);
                if (bundle != null) {
                    bundle.setClassLoader(fragment.getClass().getClassLoader());
                    fragment.setArguments(bundle);
                }
                return fragment;
            } catch (ClassCastException e) {
                throw new InstantiationException(FGI.A0U("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
            } catch (ClassNotFoundException e2) {
                throw new InstantiationException(FGI.A0U("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
            }
        } catch (IllegalAccessException e3) {
            throw new InstantiationException(FGI.A0U("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (java.lang.InstantiationException e4) {
            throw new InstantiationException(FGI.A0U("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e4);
        } catch (NoSuchMethodException e5) {
            throw new InstantiationException(FGI.A0U("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e5);
        } catch (InvocationTargetException e6) {
            throw new InstantiationException(FGI.A0U("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e6);
        }
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        AbstractC8595Fgx<?> abstractC8595Fgx = this.mHost;
        if (abstractC8595Fgx != null) {
            FragmentActivity fragmentActivity = ((C8576FgZ) abstractC8595Fgx).A00;
            LayoutInflater layoutInflaterCloneInContext = fragmentActivity.getLayoutInflater().cloneInContext(fragmentActivity);
            layoutInflaterCloneInContext.setFactory2(this.mChildFragmentManager.A0S);
            return layoutInflaterCloneInContext;
        }
        throw C3cG.A0Q("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public final String getString(int i, Object... objArr) {
        return requireContext().getResources().getString(i, objArr);
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        Handler handlerA02;
        ensureAnimationInfo().A0J = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        AbstractC8571FgQ abstractC8571FgQ = this.mFragmentManager;
        if (abstractC8571FgQ != null) {
            handlerA02 = abstractC8571FgQ.A09.A02;
        } else {
            handlerA02 = C60O.A02();
        }
        this.mPostponedHandler = handlerA02;
        handlerA02.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public final <I, O> HwU<I> registerForActivityResult(Hx6<I, O> hx6, AbstractC8583Fgi abstractC8583Fgi, FT4<O> ft4) {
        return prepareCallInternal(hx6, new C8600Fh4(abstractC8583Fgi, this), ft4);
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                C10442Hhp c10442Hhp = this.mViewLifecycleOwner;
                c10442Hhp.A00.A06(EnumC3085Bxl.ON_CREATE);
                return;
            }
            return;
        }
        throw A02(" did not call through to super.onViewStateRestored()", AbstractC7609F5w.A0u(this));
    }

    public void startActivity(Intent intent, Bundle bundle) {
        AbstractC8595Fgx<?> abstractC8595Fgx = this.mHost;
        if (abstractC8595Fgx != null) {
            C7384Etj.A0Y(intent, 1);
            abstractC8595Fgx.A01.startActivity(intent, bundle);
            return;
        }
        throw BV8.A0m(" not attached to Activity", AbstractC7609F5w.A0u(this));
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (this.mHost != null) {
            AbstractC8571FgQ parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.A03 != null) {
                String str = this.mWho;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = new FragmentManager$LaunchedFragmentInfo();
                fragmentManager$LaunchedFragmentInfo.A01 = str;
                fragmentManager$LaunchedFragmentInfo.A00 = i;
                parentFragmentManager.A0C.addLast(fragmentManager$LaunchedFragmentInfo);
                if (bundle != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                parentFragmentManager.A03.A01(null, intent);
                return;
            }
            AbstractC8595Fgx<?> abstractC8595Fgx = parentFragmentManager.A09;
            C7384Etj.A0Y(intent, 1);
            if (i == -1) {
                abstractC8595Fgx.A01.startActivity(intent, bundle);
                return;
            }
            throw C3cG.A0Q("Starting activity with a requestCode requires a FragmentActivity host");
        }
        throw BV8.A0m(" not attached to Activity", AbstractC7609F5w.A0u(this));
    }
}
