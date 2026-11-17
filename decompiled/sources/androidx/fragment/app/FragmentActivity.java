package androidx.fragment.app;

import X.AbstractC8330Fbx;
import X.AbstractC8571FgQ;
import X.AbstractC8595Fgx;
import X.AbstractC8628Fhf;
import X.AbstractC8629Fhg;
import X.BV6;
import X.BV7;
import X.C10442Hhp;
import X.C10637I0h;
import X.C5303Dfm;
import X.C8576FgZ;
import X.C8577Fgb;
import X.C8609FhE;
import X.C8928Ftk;
import X.EnumC10573Huf;
import X.EnumC3085Bxl;
import X.FGI;
import X.InterfaceC8623FhT;
import X.SharedElementCallbackC8592Fgt;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class FragmentActivity extends ComponentActivity {
    public static final String LIFECYCLE_TAG = "android:support:lifecycle";
    public boolean mCreated;
    public final C5303Dfm mFragmentLifecycleRegistry;
    public final C8609FhE mFragments;
    public boolean mResumed;
    public boolean mStopped;

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            startIntentSenderForResult(intentSender, -1, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public static void A04(FragmentActivity fragmentActivity) {
        fragmentActivity.mFragments.A00.A03.A0c();
    }

    private void init() {
        this.savedStateRegistryController.A00.A03(new C8928Ftk(this, 2), LIFECYCLE_TAG);
        addOnConfigurationChangedListener(new C10637I0h(this, 3));
        addOnNewIntentListener(new C10637I0h(this, 4));
        addOnContextAvailableListener(new InterfaceC8623FhT() { // from class: X.FhI
            @Override // X.InterfaceC8623FhT
            public final void ASR(Context context) throws IOException {
                this.A00.m51lambda$init$3$androidxfragmentappFragmentActivity(context);
            }
        });
    }

    /* renamed from: lambda$init$3$androidx-fragment-app-FragmentActivity, reason: not valid java name */
    public /* synthetic */ void m51lambda$init$3$androidxfragmentappFragmentActivity(Context context) throws IOException {
        AbstractC8595Fgx<?> abstractC8595Fgx = this.mFragments.A00;
        abstractC8595Fgx.A03.A0l(null, abstractC8595Fgx, abstractC8595Fgx);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.A06(EnumC3085Bxl.ON_RESUME);
        AbstractC8571FgQ abstractC8571FgQA00 = AbstractC8330Fbx.A00(this);
        AbstractC8571FgQ.A0C(abstractC8571FgQA00);
        AbstractC8571FgQ.A0G(abstractC8571FgQA00, 7);
    }

    public void setEnterSharedElementCallback(AbstractC8629Fhg abstractC8629Fhg) {
        setEnterSharedElementCallback(abstractC8629Fhg != null ? new SharedElementCallbackC8592Fgt(abstractC8629Fhg) : null);
    }

    public void setExitSharedElementCallback(AbstractC8629Fhg abstractC8629Fhg) {
        setExitSharedElementCallback(abstractC8629Fhg != null ? new SharedElementCallbackC8592Fgt(abstractC8629Fhg) : null);
    }

    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public FragmentActivity() {
        this.mFragments = new C8609FhE(new C8576FgZ(this));
        this.mFragmentLifecycleRegistry = new C5303Dfm(this, true);
        this.mStopped = true;
        init();
    }

    public static boolean markState(AbstractC8571FgQ abstractC8571FgQ, EnumC10573Huf enumC10573Huf) {
        Iterator itA04 = AbstractC8571FgQ.A04(abstractC8571FgQ);
        boolean zMarkState = false;
        while (itA04.hasNext()) {
            Fragment fragment = (Fragment) itA04.next();
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zMarkState |= markState(fragment.getChildFragmentManager(), enumC10573Huf);
                }
                C10442Hhp c10442Hhp = fragment.mViewLifecycleOwner;
                if (c10442Hhp != null) {
                    c10442Hhp.A00();
                    if (c10442Hhp.A00.A01.A00(EnumC10573Huf.A06)) {
                        fragment.mViewLifecycleOwner.A00.A07(enumC10573Huf);
                        zMarkState = true;
                    }
                }
                if (fragment.mLifecycleRegistry.A01.A00(EnumC10573Huf.A06)) {
                    fragment.mLifecycleRegistry.A07(enumC10573Huf);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return AbstractC8330Fbx.A00(this).A0S.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(BV7.A0x(this));
            printWriter.println(" State:");
            String strA0M = FGI.A0M(str, "  ");
            printWriter.print(strA0M);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                new C8577Fgb(this, getViewModelStore()).A00(printWriter, strA0M);
            }
            AbstractC8330Fbx.A00(this).A0r(str, fileDescriptor, printWriter, strArr);
        }
    }

    public AbstractC8571FgQ getSupportFragmentManager() {
        return AbstractC8330Fbx.A00(this);
    }

    @Deprecated
    public AbstractC8628Fhf getSupportLoaderManager() {
        return new C8577Fgb(this, getViewModelStore());
    }

    /* renamed from: lambda$init$0$androidx-fragment-app-FragmentActivity, reason: not valid java name */
    public /* synthetic */ Bundle m48lambda$init$0$androidxfragmentappFragmentActivity() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.A06(EnumC3085Bxl.ON_STOP);
        return BV6.A0N();
    }

    public void markFragmentsCreated() {
        while (markState(AbstractC8330Fbx.A00(this), EnumC10573Huf.A02)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        A04(this);
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.A06(EnumC3085Bxl.ON_CREATE);
        AbstractC8571FgQ abstractC8571FgQA00 = AbstractC8330Fbx.A00(this);
        AbstractC8571FgQ.A0C(abstractC8571FgQA00);
        AbstractC8571FgQ.A0G(abstractC8571FgQA00, 1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = AbstractC8330Fbx.A00(this).A0S.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AbstractC8330Fbx.A00(this).A0a();
        this.mFragmentLifecycleRegistry.A06(EnumC3085Bxl.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 6) {
            return false;
        }
        AbstractC8571FgQ abstractC8571FgQA00 = AbstractC8330Fbx.A00(this);
        if (abstractC8571FgQA00.A00 < 1) {
            return false;
        }
        Iterator itA04 = AbstractC8571FgQ.A04(abstractC8571FgQA00);
        while (itA04.hasNext()) {
            Fragment fragment = (Fragment) itA04.next();
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        AbstractC8571FgQ.A0G(AbstractC8330Fbx.A00(this), 5);
        this.mFragmentLifecycleRegistry.A06(EnumC3085Bxl.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        A04(this);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        A04(this);
        super.onResume();
        this.mResumed = true;
        AbstractC8330Fbx.A00(this).A0s(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        A04(this);
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            AbstractC8571FgQ abstractC8571FgQA00 = AbstractC8330Fbx.A00(this);
            AbstractC8571FgQ.A0C(abstractC8571FgQA00);
            AbstractC8571FgQ.A0G(abstractC8571FgQA00, 4);
        }
        AbstractC8330Fbx.A00(this).A0s(true);
        this.mFragmentLifecycleRegistry.A06(EnumC3085Bxl.ON_START);
        AbstractC8571FgQ abstractC8571FgQA002 = AbstractC8330Fbx.A00(this);
        AbstractC8571FgQ.A0C(abstractC8571FgQA002);
        AbstractC8571FgQ.A0G(abstractC8571FgQA002, 5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        A04(this);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        AbstractC8571FgQ abstractC8571FgQA00 = AbstractC8330Fbx.A00(this);
        abstractC8571FgQA00.A0K = true;
        abstractC8571FgQA00.A0A.A01 = true;
        AbstractC8571FgQ.A0G(abstractC8571FgQA00, 4);
        this.mFragmentLifecycleRegistry.A06(EnumC3085Bxl.ON_STOP);
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    /* renamed from: lambda$init$1$androidx-fragment-app-FragmentActivity, reason: not valid java name */
    public /* synthetic */ void m49lambda$init$1$androidxfragmentappFragmentActivity(Configuration configuration) {
        A04(this);
    }

    /* renamed from: lambda$init$2$androidx-fragment-app-FragmentActivity, reason: not valid java name */
    public /* synthetic */ void m50lambda$init$2$androidxfragmentappFragmentActivity(Intent intent) {
        A04(this);
    }

    public FragmentActivity(int i) {
        super(i);
        this.mFragments = new C8609FhE(new C8576FgZ(this));
        this.mFragmentLifecycleRegistry = new C5303Dfm(this, true);
        this.mStopped = true;
        init();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = AbstractC8330Fbx.A00(this).A0S.onCreateView(null, str, context, attributeSet);
        if (viewOnCreateView == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return viewOnCreateView;
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }
}
