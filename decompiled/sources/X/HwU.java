package X;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import androidx.activity.ComponentActivity;
import androidx.activity.result.IntentSenderRequest;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class HwU<I> {
    public final void A02(I i) {
        A01(null, i);
    }

    public void A00() {
        AbstractC8583Fgi abstractC8583Fgi;
        String str;
        if (this instanceof C8588Fgn) {
            C8588Fgn c8588Fgn = (C8588Fgn) this;
            abstractC8583Fgi = c8588Fgn.A00;
            str = c8588Fgn.A02;
        } else {
            if (this instanceof Hmx) {
                HwU hwU = (HwU) C8j3.A10(((Hmx) this).A02);
                if (hwU != null) {
                    hwU.A00();
                    return;
                }
                return;
            }
            C8587Fgm c8587Fgm = (C8587Fgm) this;
            abstractC8583Fgi = c8587Fgm.A00;
            str = c8587Fgm.A02;
        }
        abstractC8583Fgi.A03(str);
    }

    /* JADX WARN: Incorrect types in method signature: (TI;LX/72P;)V */
    public void A01(C72P c72p, Object obj) {
        AbstractC8583Fgi abstractC8583Fgi;
        String str;
        Hx6 hx6;
        final int iA0F;
        List<String> list;
        Bundle bundleExtra;
        Handler handlerA02;
        Runnable runnable;
        if (this instanceof Hmx) {
            HwU hwU = (HwU) ((Hmx) this).A02.get();
            if (hwU == null) {
                throw C3cG.A0Q("Operation cannot be started before fragment is in created state");
            }
            hwU.A01(c72p, obj);
            return;
        }
        if (this instanceof C8588Fgn) {
            C8588Fgn c8588Fgn = (C8588Fgn) this;
            abstractC8583Fgi = c8588Fgn.A00;
            Map<String, Integer> map = abstractC8583Fgi.A02;
            str = c8588Fgn.A02;
            Integer num = map.get(str);
            hx6 = c8588Fgn.A01;
            if (num == null) {
                StringBuilder sbA0f = C3cG.A0f(hx6, "Attempting to launch an unregistered ActivityResultLauncher with contract ");
                sbA0f.append(" and input ");
                sbA0f.append(obj);
                throw BV8.A0m(". You must ensure the ActivityResultLauncher is registered before calling launch().", sbA0f);
            }
            iA0F = AnonymousClass001.A0F(num);
            list = abstractC8583Fgi.A01;
            list.add(str);
        } else {
            C8587Fgm c8587Fgm = (C8587Fgm) this;
            abstractC8583Fgi = c8587Fgm.A00;
            Map<String, Integer> map2 = abstractC8583Fgi.A02;
            str = c8587Fgm.A02;
            Integer num2 = map2.get(str);
            hx6 = c8587Fgm.A01;
            if (num2 == null) {
                StringBuilder sbA0f2 = C3cG.A0f(hx6, "Attempting to launch an unregistered ActivityResultLauncher with contract ");
                sbA0f2.append(" and input ");
                sbA0f2.append(obj);
                throw BV8.A0m(". You must ensure the ActivityResultLauncher is registered before calling launch().", sbA0f2);
            }
            iA0F = AnonymousClass001.A0F(num2);
            list = abstractC8583Fgi.A01;
            list.add(str);
        }
        try {
            final C8581Fgf c8581Fgf = (C8581Fgf) abstractC8583Fgi;
            C7384Etj.A0Y(hx6, 1);
            ComponentActivity componentActivity = c8581Fgf.A00;
            final AnonymousClass795 synchronousResult = hx6.getSynchronousResult(componentActivity, obj);
            if (synchronousResult != null) {
                handlerA02 = C60O.A02();
                runnable = new Runnable() { // from class: X.Fgq
                    public static final String __redex_internal_original_name = "ComponentActivity$activityResultRegistry$1$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C8581Fgf c8581Fgf2 = c8581Fgf;
                        int i = iA0F;
                        Object obj2 = synchronousResult.A00;
                        String str2 = (String) BV5.A0f(c8581Fgf2.A04, i);
                        if (str2 != null) {
                            C8602Fh6<?> c8602Fh6 = c8581Fgf2.A06.get(str2);
                            if (c8602Fh6 == null) {
                                ((AbstractC8583Fgi) c8581Fgf2).A00.remove(str2);
                                c8581Fgf2.A03.put(str2, obj2);
                            } else {
                                FT4<?> ft4 = c8602Fh6.A00;
                                if (c8581Fgf2.A01.remove(str2)) {
                                    ft4.onActivityResult(obj2);
                                }
                            }
                        }
                    }
                };
            } else {
                Intent intentCreateIntent = hx6.createIntent(componentActivity, obj);
                if (intentCreateIntent.getExtras() != null) {
                    Bundle extras = intentCreateIntent.getExtras();
                    C7384Etj.A0X(extras);
                    if (extras.getClassLoader() == null) {
                        intentCreateIntent.setExtrasClassLoader(componentActivity.getClassLoader());
                    }
                }
                if (intentCreateIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                    bundleExtra = intentCreateIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    intentCreateIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                } else {
                    bundleExtra = null;
                }
                if (BV5.A1Q(intentCreateIntent, C60N.A00(21))) {
                    String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra(C60N.A00(6));
                    if (stringArrayExtra == null) {
                        stringArrayExtra = new String[0];
                    }
                    C7VR.A00(componentActivity, stringArrayExtra, iA0F);
                    return;
                }
                if (!BV5.A1Q(intentCreateIntent, "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST")) {
                    componentActivity.startActivityForResult(intentCreateIntent, iA0F, bundleExtra);
                    return;
                }
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentCreateIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    C7384Etj.A0X(intentSenderRequest);
                    componentActivity.startIntentSenderForResult(intentSenderRequest.A03, iA0F, intentSenderRequest.A02, intentSenderRequest.A00, intentSenderRequest.A01, 0, bundleExtra);
                    return;
                } catch (IntentSender.SendIntentException e) {
                    handlerA02 = C60O.A02();
                    runnable = new Runnable() { // from class: X.Fh1
                        public static final String __redex_internal_original_name = "ComponentActivity$activityResultRegistry$1$$ExternalSyntheticLambda1";

                        @Override // java.lang.Runnable
                        public final void run() {
                            c8581Fgf.A04(new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", e), iA0F, 0);
                        }
                    };
                }
            }
            handlerA02.post(runnable);
        } catch (Exception e2) {
            list.remove(str);
            throw e2;
        }
    }
}
