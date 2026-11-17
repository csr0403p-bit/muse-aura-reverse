package androidx.activity;

import X.A6H;
import X.A6I;
import X.A6J;
import X.A6K;
import X.A6O;
import X.A6X;
import X.A6Y;
import X.AbstractC1720Ap8;
import X.AbstractC3136BzG;
import X.AbstractC7607F5u;
import X.AbstractC7611F5y;
import X.AbstractC8583Fgi;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BJt;
import X.BOD;
import X.BRk;
import X.BV4;
import X.BV6;
import X.BeM;
import X.C0856A6d;
import X.C0862A6j;
import X.C1HY;
import X.C2183B9b;
import X.C2186B9f;
import X.C28u;
import X.C2mE;
import X.C3cG;
import X.C3cH;
import X.C5303Dfm;
import X.C60N;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.C8074FSc;
import X.C8419Fdc;
import X.C8420Fdd;
import X.C8421Fde;
import X.C8581Fgf;
import X.C8593Fgu;
import X.C8622FhS;
import X.C8624FhU;
import X.C8928Ftk;
import X.C8940Ftw;
import X.C8945Fu1;
import X.Dg3;
import X.EnumC10573Huf;
import X.EnumC3085Bxl;
import X.F0C;
import X.F2N;
import X.FGI;
import X.FT4;
import X.FragmentC3090Bxy;
import X.Hil;
import X.HqA;
import X.Hr3;
import X.HwU;
import X.Hx6;
import X.InterfaceC08439ui;
import X.InterfaceC10559Hsu;
import X.InterfaceC2262BMi;
import X.InterfaceC8348FcM;
import X.InterfaceC8615FhK;
import X.InterfaceC8616FhL;
import X.InterfaceC8617FhM;
import X.InterfaceC8620FhQ;
import X.InterfaceC8623FhT;
import X.InterfaceExecutorC8619FhP;
import X.RunnableC8586Fgl;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.savedstate.SavedStateRegistry;
import com.facebook.aura.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Deprecated;
import kotlin.Unit;

/* loaded from: classes6.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements BRk, C1HY, BOD, A6I, InterfaceC2262BMi, InterfaceC10559Hsu, Hr3, C28u, InterfaceC8617FhM, InterfaceC8616FhL, InterfaceC8615FhK, InterfaceC8620FhQ {
    public static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    public BJt _viewModelStore;
    public final AbstractC8583Fgi activityResultRegistry;
    public int contentLayoutId;
    public final C8074FSc contextAwareHelper;
    public final F0C defaultViewModelProviderFactory$delegate;
    public boolean dispatchingOnMultiWindowModeChanged;
    public boolean dispatchingOnPictureInPictureModeChanged;
    public final F0C fullyDrawnReporter$delegate;
    public final C8419Fdc menuHostHelper;
    public final AtomicInteger nextLocalRequestCode;
    public final F0C onBackPressedDispatcher$delegate;
    public final F0C onBackPressedInput$delegate;
    public final CopyOnWriteArrayList<BeM<Configuration>> onConfigurationChangedListeners;
    public final CopyOnWriteArrayList<BeM<C8622FhS>> onMultiWindowModeChangedListeners;
    public final CopyOnWriteArrayList<BeM<Intent>> onNewIntentListeners;
    public final CopyOnWriteArrayList<BeM<HqA>> onPictureInPictureModeChangedListeners;
    public final CopyOnWriteArrayList<BeM<Integer>> onTrimMemoryListeners;
    public final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    public final InterfaceExecutorC8619FhP reportFullyDrawnExecutor;
    public final A6O savedStateRegistryController;

    public static final void _init_$lambda$1(ComponentActivity componentActivity, C1HY c1hy, EnumC3085Bxl enumC3085Bxl) {
        Window window;
        View viewPeekDecorView;
        C7384Etj.A0Y(enumC3085Bxl, 2);
        if (enumC3085Bxl != EnumC3085Bxl.ON_STOP || (window = componentActivity.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    public static final void _init_$lambda$2(ComponentActivity componentActivity, C1HY c1hy, EnumC3085Bxl enumC3085Bxl) {
        C7384Etj.A0Y(enumC3085Bxl, 2);
        if (enumC3085Bxl == EnumC3085Bxl.ON_DESTROY) {
            componentActivity.contextAwareHelper.A01 = null;
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().A00();
            }
            RunnableC8586Fgl runnableC8586Fgl = (RunnableC8586Fgl) componentActivity.reportFullyDrawnExecutor;
            ComponentActivity componentActivity2 = runnableC8586Fgl.A03;
            AbstractC7607F5u.A0a(componentActivity2).removeCallbacks(runnableC8586Fgl);
            AbstractC7607F5u.A0a(componentActivity2).getViewTreeObserver().removeOnDrawListener(runnableC8586Fgl);
        }
    }

    public static final void addObserverForBackInvoker$lambda$0(C2186B9f c2186B9f, ComponentActivity componentActivity, C1HY c1hy, EnumC3085Bxl enumC3085Bxl) {
        C7384Etj.A0Y(enumC3085Bxl, 3);
        if (enumC3085Bxl == EnumC3085Bxl.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = componentActivity.getOnBackInvokedDispatcher();
            C7384Etj.A0U(onBackInvokedDispatcher);
            c2186B9f.A00(onBackInvokedDispatcher);
        }
    }

    @Override // X.InterfaceC8620FhQ
    public void addMenuProvider(InterfaceC8348FcM interfaceC8348FcM) {
        C7384Etj.A0Y(interfaceC8348FcM, 0);
        C8419Fdc c8419Fdc = this.menuHostHelper;
        c8419Fdc.A02.add(interfaceC8348FcM);
        c8419Fdc.A00.run();
    }

    @Override // X.Hr3
    public final void addOnConfigurationChangedListener(BeM<Configuration> beM) {
        C7384Etj.A0Y(beM, 0);
        this.onConfigurationChangedListeners.add(beM);
    }

    public final void addOnContextAvailableListener(InterfaceC8623FhT interfaceC8623FhT) {
        C7384Etj.A0Y(interfaceC8623FhT, 0);
        C8074FSc c8074FSc = this.contextAwareHelper;
        Context context = c8074FSc.A01;
        if (context != null) {
            interfaceC8623FhT.ASR(context);
        }
        c8074FSc.A00.add(interfaceC8623FhT);
    }

    @Override // X.InterfaceC8617FhM
    public final void addOnMultiWindowModeChangedListener(BeM<C8622FhS> beM) {
        C7384Etj.A0Y(beM, 0);
        this.onMultiWindowModeChangedListeners.add(beM);
    }

    public final void addOnNewIntentListener(BeM<Intent> beM) {
        C7384Etj.A0Y(beM, 0);
        this.onNewIntentListeners.add(beM);
    }

    @Override // X.InterfaceC8616FhL
    public final void addOnPictureInPictureModeChangedListener(BeM<HqA> beM) {
        C7384Etj.A0Y(beM, 0);
        this.onPictureInPictureModeChangedListeners.add(beM);
    }

    @Override // X.InterfaceC8615FhK
    public final void addOnTrimMemoryListener(BeM<Integer> beM) {
        C7384Etj.A0Y(beM, 0);
        this.onTrimMemoryListeners.add(beM);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        C7384Etj.A0Y(runnable, 0);
        this.onUserLeaveHintListeners.add(runnable);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        C7384Etj.A0Y(configuration, 0);
        super.onConfigurationChanged(configuration);
        Iterator<BeM<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        C7384Etj.A0U(it);
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        C7384Etj.A0Y(menu, 1);
        if (i == 0) {
            super.onCreatePanelMenu(i, menu);
            C8419Fdc c8419Fdc = this.menuHostHelper;
            MenuInflater menuInflater = getMenuInflater();
            Iterator<InterfaceC8348FcM> it = c8419Fdc.A02.iterator();
            while (it.hasNext()) {
                C8421Fde.A00(it).A0u(menu, menuInflater);
            }
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        C7384Etj.A0Y(menuItem, 1);
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator<InterfaceC8348FcM> it = this.menuHostHelper.A02.iterator();
        while (it.hasNext()) {
            if (C8421Fde.A00(it).A0v(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        C7384Etj.A0Y(intent, 0);
        super.onNewIntent(intent);
        Iterator<BeM<Intent>> it = this.onNewIntentListeners.iterator();
        C7384Etj.A0U(it);
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        C7384Etj.A0Y(menu, 1);
        Iterator<InterfaceC8348FcM> it = this.menuHostHelper.A02.iterator();
        while (it.hasNext()) {
            C8421Fde.A00(it).A0f(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        C7384Etj.A0Y(menu, 2);
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator<InterfaceC8348FcM> it = this.menuHostHelper.A02.iterator();
        while (it.hasNext()) {
            C8421Fde.A00(it).A0t(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C8624FhU c8624FhU;
        BJt bJt = this._viewModelStore;
        if (bJt == null && ((c8624FhU = (C8624FhU) getLastNonConfigurationInstance()) == null || (bJt = c8624FhU.A00) == null)) {
            return null;
        }
        C8624FhU c8624FhU2 = new C8624FhU();
        c8624FhU2.A00 = bJt;
        return c8624FhU2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C7384Etj.A0Y(bundle, 0);
        C5303Dfm c5303Dfm = this.lifecycleRegistry;
        if (c5303Dfm != null) {
            c5303Dfm.A07(EnumC10573Huf.A02);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.A02(bundle);
    }

    @Override // X.InterfaceC8620FhQ
    public void removeMenuProvider(InterfaceC8348FcM interfaceC8348FcM) {
        C7384Etj.A0Y(interfaceC8348FcM, 0);
        this.menuHostHelper.A00(interfaceC8348FcM);
    }

    @Override // X.Hr3
    public final void removeOnConfigurationChangedListener(BeM<Configuration> beM) {
        C7384Etj.A0Y(beM, 0);
        this.onConfigurationChangedListeners.remove(beM);
    }

    public final void removeOnContextAvailableListener(InterfaceC8623FhT interfaceC8623FhT) {
        C7384Etj.A0Y(interfaceC8623FhT, 0);
        this.contextAwareHelper.A00.remove(interfaceC8623FhT);
    }

    @Override // X.InterfaceC8617FhM
    public final void removeOnMultiWindowModeChangedListener(BeM<C8622FhS> beM) {
        C7384Etj.A0Y(beM, 0);
        this.onMultiWindowModeChangedListeners.remove(beM);
    }

    public final void removeOnNewIntentListener(BeM<Intent> beM) {
        C7384Etj.A0Y(beM, 0);
        this.onNewIntentListeners.remove(beM);
    }

    @Override // X.InterfaceC8616FhL
    public final void removeOnPictureInPictureModeChangedListener(BeM<HqA> beM) {
        C7384Etj.A0Y(beM, 0);
        this.onPictureInPictureModeChangedListeners.remove(beM);
    }

    @Override // X.InterfaceC8615FhK
    public final void removeOnTrimMemoryListener(BeM<Integer> beM) {
        C7384Etj.A0Y(beM, 0);
        this.onTrimMemoryListeners.remove(beM);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        C7384Etj.A0Y(runnable, 0);
        this.onUserLeaveHintListeners.remove(runnable);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(Intent intent, int i) {
        C7384Etj.A0Y(intent, 0);
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        C7384Etj.A0Y(intentSender, 0);
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public static final void _init_$lambda$4(ComponentActivity componentActivity, Context context) {
        Bundle bundleA00 = componentActivity.savedStateRegistryController.A00.A00(ACTIVITY_RESULT_TAG);
        if (bundleA00 != null) {
            AbstractC8583Fgi abstractC8583Fgi = componentActivity.activityResultRegistry;
            ArrayList<Integer> integerArrayList = bundleA00.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA00.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleA00.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                abstractC8583Fgi.A01.addAll(stringArrayList2);
            }
            Bundle bundle = bundleA00.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle != null) {
                abstractC8583Fgi.A00.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                Map<String, Integer> map = abstractC8583Fgi.A02;
                if (map.containsKey(str)) {
                    Integer numRemove = map.remove(str);
                    if (!abstractC8583Fgi.A00.containsKey(str)) {
                        C0862A6j.A01(abstractC8583Fgi.A04).remove(numRemove);
                    }
                }
                Integer num = integerArrayList.get(i);
                C7384Etj.A0U(num);
                int iIntValue = num.intValue();
                String str2 = stringArrayList.get(i);
                C7384Etj.A0U(str2);
                Map<Integer, String> map2 = abstractC8583Fgi.A04;
                Integer numValueOf = Integer.valueOf(iIntValue);
                map2.put(numValueOf, str2);
                map.put(str2, numValueOf);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addObserverForBackInvoker(C2186B9f c2186B9f) {
        this.lifecycleRegistry.A04(new C8940Ftw(0, this, c2186B9f));
    }

    private final InterfaceExecutorC8619FhP createFullyDrawnExecutor() {
        return new RunnableC8586Fgl(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            C8624FhU c8624FhU = (C8624FhU) getLastNonConfigurationInstance();
            if (c8624FhU != null) {
                this._viewModelStore = c8624FhU.A00;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new BJt();
            }
        }
    }

    public static final C8593Fgu fullyDrawnReporter_delegate$lambda$0(ComponentActivity componentActivity) {
        return new C8593Fgu(componentActivity.reportFullyDrawnExecutor, new Hil(componentActivity, 0));
    }

    private final C2mE getOnBackPressedInput() {
        return (C2mE) this.onBackPressedInput$delegate.getValue();
    }

    public static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    public static final C2186B9f onBackPressedDispatcher_delegate$lambda$0(final ComponentActivity componentActivity) {
        final C2186B9f c2186B9f = new C2186B9f(new Runnable() { // from class: X.FhN
            public static final String __redex_internal_original_name = "ComponentActivity$$ExternalSyntheticLambda9";

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                ComponentActivity.onBackPressedDispatcher_delegate$lambda$0$0(this.A00);
            }
        });
        if (Build.VERSION.SDK_INT >= 33) {
            if (C3cH.A1K()) {
                componentActivity.addObserverForBackInvoker(c2186B9f);
                return c2186B9f;
            }
            C60O.A02().post(new Runnable() { // from class: X.FhG
                public static final String __redex_internal_original_name = "ComponentActivity$$ExternalSyntheticLambda10";

                @Override // java.lang.Runnable
                public final void run() {
                    this.A00.addObserverForBackInvoker(c2186B9f);
                }
            });
        }
        return c2186B9f;
    }

    public static final C2mE onBackPressedInput_delegate$lambda$0(ComponentActivity componentActivity) {
        C2mE c2mE = new C2mE();
        componentActivity.getOnBackPressedDispatcher().A02.A02(c2mE);
        return c2mE;
    }

    @Override // X.InterfaceC10559Hsu
    public final AbstractC8583Fgi getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // X.BRk
    public A6J getDefaultViewModelCreationExtras() {
        Bundle extras;
        C0856A6d c0856A6d = new C0856A6d(A6K.A00);
        if (getApplication() != null) {
            c0856A6d.A01(A6Y.A02, getApplication());
        }
        c0856A6d.A01(A6H.A01, this);
        c0856A6d.A01(A6H.A02, this);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            c0856A6d.A01(A6H.A00, extras);
        }
        return c0856A6d;
    }

    @Override // X.BRk
    public InterfaceC08439ui getDefaultViewModelProviderFactory() {
        return (InterfaceC08439ui) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public C8593Fgu getFullyDrawnReporter() {
        return (C8593Fgu) this.fullyDrawnReporter$delegate.getValue();
    }

    @Override // androidx.core.app.ComponentActivity, X.C1HY
    public F2N getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // X.InterfaceC2262BMi
    public final C2186B9f getOnBackPressedDispatcher() {
        return (C2186B9f) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // X.A6I
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistryController.A00;
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      with the appropriate {@link ActivityResultContract} and handling the result in the\n      {@link ActivityResultCallback#onActivityResult(Object) callback}.")
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.activityResultRegistry.A04(intent, i, i2)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.A01(bundle);
        C8074FSc c8074FSc = this.contextAwareHelper;
        c8074FSc.A01 = this;
        Iterator<InterfaceC8623FhT> it = c8074FSc.A00.iterator();
        while (it.hasNext()) {
            it.next().ASR(this);
        }
        super.onCreate(bundle);
        FragmentC3090Bxy.A00(this);
        int i = this.contentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity
    @Deprecated(message = "Deprecated in android.app.Activity")
    public void onMultiWindowModeChanged(boolean z) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<BeM<C8622FhS>> it = this.onMultiWindowModeChangedListeners.iterator();
        C7384Etj.A0U(it);
        while (it.hasNext()) {
            it.next().accept(new C8622FhS());
        }
    }

    @Override // android.app.Activity
    @Deprecated(message = "Deprecated in android.app.Activity")
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<BeM<HqA>> it = this.onPictureInPictureModeChangedListeners.iterator();
        C7384Etj.A0U(it);
        while (it.hasNext()) {
            it.next().accept(new HqA(z));
        }
    }

    @Deprecated(message = "Use a {@link androidx.lifecycle.ViewModel} to store non config state.")
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.A01;
    }

    public static /* synthetic */ Unit $r8$lambda$wJ5MHcSJed_CjC7r4OWD0UxyJsQ(ComponentActivity componentActivity) {
        componentActivity.reportFullyDrawn();
        return Unit.INSTANCE;
    }

    public ComponentActivity() {
        this.contextAwareHelper = new C8074FSc();
        this.menuHostHelper = new C8419Fdc(new Runnable() { // from class: X.FhF
            public static final String __redex_internal_original_name = "ComponentActivity$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                this.A00.invalidateOptionsMenu();
            }
        });
        A6O a6oA00 = A6O.A00(this);
        this.savedStateRegistryController = a6oA00;
        this.reportFullyDrawnExecutor = new RunnableC8586Fgl(this);
        this.fullyDrawnReporter$delegate = AbstractC7607F5u.A1A(null, new Hil(this, 1));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new C8581Fgf(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        this.onBackPressedInput$delegate = AbstractC7607F5u.A1A(null, new Hil(this, 2));
        C5303Dfm c5303Dfm = this.lifecycleRegistry;
        if (c5303Dfm == null) {
            throw C3cG.A0Q("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        c5303Dfm.A04(new C8945Fu1(this, 0));
        this.lifecycleRegistry.A04(new C8945Fu1(this, 1));
        this.lifecycleRegistry.A04(new C8945Fu1(this, 2));
        a6oA00.A01.A00();
        A6H.A02(this);
        this.savedStateRegistryController.A00.A03(new C8928Ftk(this, 0), ACTIVITY_RESULT_TAG);
        addOnContextAvailableListener(new InterfaceC8623FhT() { // from class: X.FhH
            @Override // X.InterfaceC8623FhT
            public final void ASR(Context context) {
                ComponentActivity._init_$lambda$4(this.A00, context);
            }
        });
        this.defaultViewModelProviderFactory$delegate = AbstractC7607F5u.A1A(null, new Hil(this, 3));
        this.onBackPressedDispatcher$delegate = AbstractC7607F5u.A1A(null, new Hil(this, 4));
    }

    public static final Bundle _init_$lambda$3(ComponentActivity componentActivity) {
        Bundle bundleA0N = BV6.A0N();
        AbstractC8583Fgi abstractC8583Fgi = componentActivity.activityResultRegistry;
        Map<String, Integer> map = abstractC8583Fgi.A02;
        bundleA0N.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", BV4.A0t(map.values()));
        bundleA0N.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", BV4.A0t(map.keySet()));
        bundleA0N.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", BV4.A0t(abstractC8583Fgi.A01));
        bundleA0N.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(abstractC8583Fgi.A00));
        return bundleA0N;
    }

    public static final A6X defaultViewModelProviderFactory_delegate$lambda$0(ComponentActivity componentActivity) {
        return new A6X(componentActivity.getApplication(), componentActivity.getIntent() != null ? componentActivity.getIntent().getExtras() : null, componentActivity);
    }

    public static final Unit fullyDrawnReporter_delegate$lambda$0$0(ComponentActivity componentActivity) {
        componentActivity.reportFullyDrawn();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onBackPressedDispatcher_delegate$lambda$0$0(androidx.activity.ComponentActivity r2) throws java.lang.Throwable {
        /*
            super.onBackPressed()     // Catch: java.lang.IllegalStateException -> L4 java.lang.NullPointerException -> Lc
            return
        L4:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "Can not perform this action after onSaveInstanceState"
            goto L13
        Lc:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference"
        L13:
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1a
            throw r2
        L1a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.ComponentActivity.onBackPressedDispatcher_delegate$lambda$0$0(androidx.activity.ComponentActivity):void");
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.reportFullyDrawnExecutor.AiI(AbstractC7607F5u.A0b(this));
        super.addContentView(view, layoutParams);
    }

    @Deprecated(message = "Use a {@link androidx.lifecycle.ViewModel} to store non config state.")
    public Object getLastCustomNonConfigurationInstance() {
        getLastNonConfigurationInstance();
        return null;
    }

    @Override // X.C28u
    public C2183B9b getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().A02;
    }

    @Override // X.BOD
    public BJt getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        BJt bJt = this._viewModelStore;
        C7384Etj.A0X(bJt);
        return bJt;
    }

    public void initializeViewTreeOwners() {
        AbstractC1720Ap8.A01(AbstractC7607F5u.A0b(this), this);
        AbstractC7607F5u.A0b(this).setTag(R.id.view_tree_view_model_store_owner, this);
        AbstractC7607F5u.A0b(this).setTag(R.id.view_tree_saved_state_registry_owner, this);
        AbstractC7607F5u.A0b(this).setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        AbstractC7607F5u.A0b(this).setTag(R.id.report_drawn, this);
        AbstractC7607F5u.A0b(this).setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the\n      {@link OnBackPressedDispatcher} via {@link #getOnBackPressedDispatcher()}.\n      The OnBackPressedDispatcher controls how back button events are dispatched\n      to one or more {@link OnBackPressedCallback} objects.")
    public void onBackPressed() {
        getOnBackPressedInput().A03();
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)} passing\n      in a {@link RequestMultiplePermissions} object for the {@link ActivityResultContract} and\n      handling the result in the {@link ActivityResultCallback#onActivityResult(Object) callback}.")
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        AnonymousClass003.A0x(strArr, iArr);
        if (this.activityResultRegistry.A04(new Intent().putExtra(C60N.A00(6), strArr).putExtra(C60N.A00(65), iArr), i, -1)) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<BeM<Integer>> it = this.onTrimMemoryListeners.iterator();
        C7384Etj.A0U(it);
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        C7384Etj.A0U(it);
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public final <I, O> HwU<I> registerForActivityResult(Hx6<I, O> hx6, FT4<O> ft4) {
        AnonymousClass003.A0u(hx6, ft4);
        return registerForActivityResult(hx6, this.activityResultRegistry, ft4);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (Trace.isEnabled()) {
                AbstractC3136BzG.A00("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().A00();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        this.reportFullyDrawnExecutor.AiI(AbstractC7607F5u.A0b(this));
        super.setContentView(i);
    }

    public ComponentActivity(int i) {
        this();
        this.contentLayoutId = i;
    }

    public void addMenuProvider(final InterfaceC8348FcM interfaceC8348FcM, C1HY c1hy, final EnumC10573Huf enumC10573Huf) {
        AnonymousClass005.A0x(interfaceC8348FcM, c1hy, enumC10573Huf);
        final C8419Fdc c8419Fdc = this.menuHostHelper;
        F2N lifecycle = c1hy.getLifecycle();
        Map<InterfaceC8348FcM, C8420Fdd> map = c8419Fdc.A01;
        AbstractC7611F5y.A0u(interfaceC8348FcM, map);
        map.put(interfaceC8348FcM, new C8420Fdd(lifecycle, new Dg3() { // from class: X.Fgr
            @Override // X.Dg3
            public final void onStateChanged(C1HY c1hy2, EnumC3085Bxl enumC3085Bxl) {
                C8419Fdc c8419Fdc2 = c8419Fdc;
                EnumC10573Huf enumC10573Huf2 = enumC10573Huf;
                InterfaceC8348FcM interfaceC8348FcM2 = interfaceC8348FcM;
                int iOrdinal = enumC10573Huf2.ordinal();
                if (enumC3085Bxl == (iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : EnumC3085Bxl.ON_RESUME : EnumC3085Bxl.ON_START : EnumC3085Bxl.ON_CREATE)) {
                    c8419Fdc2.A02.add(interfaceC8348FcM2);
                } else if (enumC3085Bxl == EnumC3085Bxl.ON_DESTROY) {
                    c8419Fdc2.A00(interfaceC8348FcM2);
                    return;
                } else if (enumC3085Bxl != EnumC3085Bxl.A00(enumC10573Huf2)) {
                    return;
                } else {
                    c8419Fdc2.A02.remove(interfaceC8348FcM2);
                }
                c8419Fdc2.A00.run();
            }
        }));
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        C7384Etj.A0Y(configuration, 1);
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<BeM<C8622FhS>> it = this.onMultiWindowModeChangedListeners.iterator();
            C7384Etj.A0U(it);
            while (it.hasNext()) {
                BeM<C8622FhS> next = it.next();
                C8622FhS c8622FhS = new C8622FhS();
                c8622FhS.A00 = configuration;
                next.accept(c8622FhS);
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C7384Etj.A0Y(configuration, 1);
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<BeM<HqA>> it = this.onPictureInPictureModeChangedListeners.iterator();
            C7384Etj.A0U(it);
            while (it.hasNext()) {
                BeM<HqA> next = it.next();
                HqA hqA = new HqA(z);
                hqA.A00 = configuration;
                next.accept(hqA);
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    public final <I, O> HwU<I> registerForActivityResult(Hx6<I, O> hx6, AbstractC8583Fgi abstractC8583Fgi, FT4<O> ft4) {
        AnonymousClass005.A0x(hx6, abstractC8583Fgi, ft4);
        return abstractC8583Fgi.A01(ft4, hx6, this, FGI.A0H("activity_rq#", this.nextLocalRequestCode.getAndIncrement()));
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.reportFullyDrawnExecutor.AiI(AbstractC7607F5u.A0b(this));
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        C7384Etj.A0Y(intent, 0);
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        C7384Etj.A0Y(intentSender, 0);
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void addMenuProvider(InterfaceC8348FcM interfaceC8348FcM, C1HY c1hy) {
        boolean zA1Y = C60P.A1Y(interfaceC8348FcM, c1hy);
        C8419Fdc c8419Fdc = this.menuHostHelper;
        c8419Fdc.A02.add(interfaceC8348FcM);
        c8419Fdc.A00.run();
        F2N lifecycle = c1hy.getLifecycle();
        Map<InterfaceC8348FcM, C8420Fdd> map = c8419Fdc.A01;
        AbstractC7611F5y.A0u(interfaceC8348FcM, map);
        map.put(interfaceC8348FcM, new C8420Fdd(lifecycle, new C8940Ftw(zA1Y ? 1 : 0, interfaceC8348FcM, c8419Fdc)));
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        this.reportFullyDrawnExecutor.AiI(AbstractC7607F5u.A0b(this));
        super.setContentView(view);
    }
}
