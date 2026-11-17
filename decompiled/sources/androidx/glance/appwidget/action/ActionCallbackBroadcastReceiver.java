package androidx.glance.appwidget.action;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC9266GBt;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass765;
import X.AnonymousClass767;
import X.C3UX;
import X.C60O;
import X.C60R;
import X.C6I8;
import X.C6vW;
import X.C76Q;
import X.C76U;
import X.C77E;
import X.C7zE;
import X.F60;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public class ActionCallbackBroadcastReceiver extends BroadcastReceiver {

    @DebugMetadata(c = "androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver$onReceive$4", f = "ActionCallbackBroadcastReceiver.kt", l = {MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver$onReceive$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $className;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ C6vW $glanceId;
        public final /* synthetic */ C77E $parameters;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;Ljava/lang/String;LX/6vW;LX/77E;LX/HtJ<-Landroidx/glance/appwidget/action/ActionCallbackBroadcastReceiver$onReceive$4;>;)V */
        public AnonymousClass4(Context context, C77E c77e, C6vW c6vW, String str, HtJ htJ) {
            super(2, htJ);
            this.$context = context;
            this.$className = str;
            this.$glanceId = c6vW;
            this.$parameters = c77e;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            Context context = this.$context;
            String str = this.$className;
            return new AnonymousClass4(context, this.$parameters, this.$glanceId, str, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws ClassNotFoundException {
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Unit.INSTANCE;
            }
            Hwg.A00(obj);
            String str = this.$className;
            this.label = 1;
            C76U.A00(str);
            throw F60.createAndThrow();
        }

        @Override // X.G0V
        public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass4) AbstractC07127nr.A09(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final AnonymousClass765 A00(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("ActionCallbackBroadcastReceiver:parameters");
        if (bundle2 == null) {
            throw C60O.A0i("The intent must contain a parameters bundle using extra: ActionCallbackBroadcastReceiver:parameters");
        }
        AnonymousClass765 anonymousClass765 = new AnonymousClass765(AGH.A05(C60R.A1b(C60O.A11(0))));
        Iterator<String> it = bundle2.keySet().iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            AnonymousClass767<? extends Object> anonymousClass767 = new AnonymousClass767<>(strA0j);
            Object obj = bundle2.get(strA0j);
            Map<AnonymousClass767<? extends Object>, Object> map = anonymousClass765.A00;
            map.get(anonymousClass767);
            if (obj == null) {
                map.remove(anonymousClass767);
            } else {
                map.put(anonymousClass767, obj);
            }
        }
        if (bundle.containsKey("android.widget.extra.CHECKED")) {
            AnonymousClass767<Boolean> anonymousClass7672 = C76Q.A00;
            Boolean boolValueOf = Boolean.valueOf(bundle.getBoolean("android.widget.extra.CHECKED"));
            Map<AnonymousClass767<? extends Object>, Object> map2 = anonymousClass765.A00;
            map2.get(anonymousClass7672);
            map2.put(anonymousClass7672, boolValueOf);
        }
        return anonymousClass765;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            if (context == null) {
                throw C60O.A0i("Context is null");
            }
            if (intent == null) {
                throw C60O.A0i("Intent is null");
            }
            Bundle extras = intent.getExtras();
            if (extras == null) {
                throw C60O.A0i("The intent must have action parameters extras.");
            }
            final AnonymousClass765 anonymousClass765A00 = A00(extras);
            final String string = extras.getString("ActionCallbackBroadcastReceiver:callbackClass");
            if (string == null) {
                throw C60O.A0i("The intent must contain a work class name string using extra: ActionCallbackBroadcastReceiver:callbackClass");
            }
            if (!intent.hasExtra("ActionCallbackBroadcastReceiver:appWidgetId")) {
                throw C60O.A0i("To update the widget, the intent must contain the AppWidgetId integer using extra: ActionCallbackBroadcastReceiver:appWidgetId");
            }
            final C6vW c6vW = new C6vW(extras.getInt("ActionCallbackBroadcastReceiver:appWidgetId"));
            if (C7zE.A00(context, new G0U() { // from class: X.76S
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    String str = string;
                    C6vW c6vW2 = c6vW;
                    C77E c77e = anonymousClass765A00;
                    AbstractC10440Hhn abstractC10440Hhn = (AbstractC10440Hhn) obj;
                    AbstractC10440Hhn abstractC10440Hhn2 = (AbstractC10440Hhn) C064876k.DEFAULT_INSTANCE.A05(C79.A0P);
                    abstractC10440Hhn2.A01();
                    ((C064876k) abstractC10440Hhn2.A00).className_ = str;
                    int i = c6vW2.A00;
                    abstractC10440Hhn2.A01();
                    ((C064876k) abstractC10440Hhn2.A00).appWidgetId_ = i;
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(((AnonymousClass765) c77e).A00);
                    ArrayList arrayListA11 = C60O.A11(mapUnmodifiableMap.size());
                    Iterator itA0n = AnonymousClass002.A0n(mapUnmodifiableMap);
                    while (itA0n.hasNext()) {
                        Map.Entry entryA0l = C3cH.A0l(itA0n);
                        AnonymousClass767 anonymousClass767 = (AnonymousClass767) entryA0l.getKey();
                        AnonymousClass002.A1J(anonymousClass767.A00, entryA0l.getValue(), arrayListA11);
                    }
                    Bundle bundleA01 = AbstractC0849A5g.A01(C3cG.A0r("ActionCallbackBroadcastReceiver:parameters", AbstractC0849A5g.A01(C60R.A1b(arrayListA11))));
                    Parcel parcelObtain = Parcel.obtain();
                    bundleA01.writeToParcel(parcelObtain, 0);
                    byte[] bArrMarshall = parcelObtain.marshall();
                    parcelObtain.recycle();
                    C9322GEd c9322GEdA01 = AbstractC9320GEb.A01(bArrMarshall, 0, bArrMarshall.length);
                    abstractC10440Hhn2.A01();
                    ((C064876k) abstractC10440Hhn2.A00).actionParameters_ = c9322GEdA01;
                    C60R.A0I(abstractC10440Hhn2, abstractC10440Hhn).requestCase_ = 5;
                    return Unit.INSTANCE;
                }
            })) {
                return;
            }
            C6I8.A00(this, AbstractC9266GBt.A00, new AnonymousClass4(context, anonymousClass765A00, c6vW, string, null));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Log.e("GlanceAppWidget", "Error in Glance App Widget", th);
        }
    }
}
