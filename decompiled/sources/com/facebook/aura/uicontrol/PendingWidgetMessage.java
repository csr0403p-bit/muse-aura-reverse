package com.facebook.aura.uicontrol;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C7384Etj;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.model.WidgetStateMutationHost;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class PendingWidgetMessage extends C06G {
    public final G0V<WidgetStateMutationHost, HtJ<? super Boolean>, Object> beforeSend;
    public final String replyToMessageId;
    public final boolean routeToLiveSession;
    public final String text;
    public final String threadId;

    @DebugMetadata(c = "com.facebook.aura.uicontrol.PendingWidgetMessage$1", f = "UiControlActionSink.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.uicontrol.PendingWidgetMessage$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<WidgetStateMutationHost, HtJ<? super Boolean>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(WidgetStateMutationHost widgetStateMutationHost, HtJ<? super Boolean> htJ) {
            return new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return AnonymousClass001.A0i();
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PendingWidgetMessage) {
                PendingWidgetMessage pendingWidgetMessage = (PendingWidgetMessage) obj;
                if (!C7384Etj.areEqual(this.threadId, pendingWidgetMessage.threadId) || !C7384Etj.areEqual(this.text, pendingWidgetMessage.text) || !C7384Etj.areEqual(this.replyToMessageId, pendingWidgetMessage.replyToMessageId) || this.routeToLiveSession != pendingWidgetMessage.routeToLiveSession || !C7384Etj.areEqual(this.beforeSend, pendingWidgetMessage.beforeSend)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PendingWidgetMessage copy$default(PendingWidgetMessage pendingWidgetMessage, String str, String str2, String str3, boolean z, G0V g0v, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pendingWidgetMessage.threadId;
        }
        if ((i & 2) != 0) {
            str2 = pendingWidgetMessage.text;
        }
        if ((i & 4) != 0) {
            str3 = pendingWidgetMessage.replyToMessageId;
        }
        if ((i & 8) != 0) {
            z = pendingWidgetMessage.routeToLiveSession;
        }
        if ((i & 16) != 0) {
            g0v = pendingWidgetMessage.beforeSend;
        }
        return pendingWidgetMessage.copy(str, str2, str3, z, g0v);
    }

    public final String component1() {
        return this.threadId;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.replyToMessageId;
    }

    public final boolean component4() {
        return this.routeToLiveSession;
    }

    public final G0V<WidgetStateMutationHost, HtJ<? super Boolean>, Object> component5() {
        return this.beforeSend;
    }

    public final G0V<WidgetStateMutationHost, HtJ<? super Boolean>, Object> getBeforeSend() {
        return this.beforeSend;
    }

    public final String getReplyToMessageId() {
        return this.replyToMessageId;
    }

    public final boolean getRouteToLiveSession() {
        return this.routeToLiveSession;
    }

    public final String getText() {
        return this.text;
    }

    public final String getThreadId() {
        return this.threadId;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.beforeSend, C0KA.A01((AnonymousClass005.A0I(this.text, AnonymousClass001.A0G(this.threadId)) + AnonymousClass006.A0G(this.replyToMessageId)) * 31, this.routeToLiveSession));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PendingWidgetMessage(String str, String str2, String str3, boolean z, G0V<? super WidgetStateMutationHost, ? super HtJ<? super Boolean>, ? extends Object> g0v) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(g0v, 4);
        this.threadId = str;
        this.text = str2;
        this.replyToMessageId = str3;
        this.routeToLiveSession = z;
        this.beforeSend = g0v;
    }

    public final PendingWidgetMessage copy(String str, String str2, String str3, boolean z, G0V<? super WidgetStateMutationHost, ? super HtJ<? super Boolean>, ? extends Object> g0v) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(g0v, 4);
        return new PendingWidgetMessage(str, str2, str3, z, g0v);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PendingWidgetMessage(String str, String str2, String str3, boolean z, G0V g0v, int i, C06H c06h) {
        this(str, str2, str3, C3cG.A1K(i & 8, z), (i & 16) != 0 ? new AnonymousClass1(null) : g0v);
    }
}
