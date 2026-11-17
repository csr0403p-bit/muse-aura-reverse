package androidx.core.app;

import X.AbstractC7607F5u;
import X.C1HY;
import X.C5303Dfm;
import X.C7384Etj;
import X.DQZ;
import X.EnumC10573Huf;
import X.F2N;
import X.FragmentC3090Bxy;
import X.Hvx;
import X.InterfaceC10513HoP;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import kotlin.Deprecated;

/* loaded from: classes6.dex */
public abstract class ComponentActivity extends Activity implements C1HY, InterfaceC10513HoP {
    public final DQZ<Class<? extends Hvx>, Hvx> extraDataMap = new DQZ<>(0);
    public final C5303Dfm lifecycleRegistry = new C5303Dfm(this, true);

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean shouldSkipDump(java.lang.String[] r4) {
        /*
            r3 = this;
            r3 = 0
            if (r4 == 0) goto L10
            int r0 = r4.length
            if (r0 == 0) goto L10
            r1 = r4[r3]
            int r0 = r1.hashCode()
            r2 = 1
            switch(r0) {
                case -645125871: goto L11;
                case 100470631: goto L1e;
                case 472614934: goto L2d;
                case 1159329357: goto L21;
                case 1455016274: goto L24;
                default: goto L10;
            }
        L10:
            return r3
        L11:
            java.lang.String r0 = "--translation"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L10
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            goto L39
        L1e:
            java.lang.String r0 = "--dump-dumpable"
            goto L2f
        L21:
            java.lang.String r0 = "--contentcapture"
            goto L26
        L24:
            java.lang.String r0 = "--autofill"
        L26:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3b
            return r3
        L2d:
            java.lang.String r0 = "--list-dumpables"
        L2f:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L10
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
        L39:
            if (r1 < r0) goto L10
        L3b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.ComponentActivity.shouldSkipDump(java.lang.String[]):boolean");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C7384Etj.A0Y(keyEvent, 0);
        C7384Etj.A0U(AbstractC7607F5u.A0a(this));
        return superDispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        C7384Etj.A0Y(keyEvent, 0);
        C7384Etj.A0U(AbstractC7607F5u.A0a(this));
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Deprecated(message = "Use {@link View#getTag(int)} with the window's decor view.")
    public <T extends Hvx> T getExtraData(Class<T> cls) {
        C7384Etj.A0Y(cls, 0);
        return (T) this.extraDataMap.get(cls);
    }

    public abstract F2N getLifecycle();

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C7384Etj.A0Y(bundle, 0);
        this.lifecycleRegistry.A07(EnumC10573Huf.A02);
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated(message = "Use {@link View#setTag(int, Object)} with the window's decor view.")
    public void putExtraData(Hvx hvx) {
        C7384Etj.A0Y(hvx, 0);
        this.extraDataMap.put(hvx.getClass(), hvx);
    }

    @Override // X.InterfaceC10513HoP
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        C7384Etj.A0Y(keyEvent, 0);
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentC3090Bxy.A00(this);
    }

    public final boolean shouldDumpInternalState(String[] strArr) {
        return !shouldSkipDump(strArr);
    }
}
