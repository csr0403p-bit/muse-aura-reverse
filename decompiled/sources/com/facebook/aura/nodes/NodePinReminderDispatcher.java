package com.facebook.aura.nodes;

import X.C2nw;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C7qW;
import X.EnumC10460Hji;
import X.HtJ;
import X.HzP;
import X.InterfaceC10560Hsz;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.nodes.core.NodePinReminderPresenter;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class NodePinReminderDispatcher {
    public final ConcurrentHashMap<String, InterfaceC10560Hsz<Boolean>> presentations;
    public volatile NodePinReminderPresenter presenter;
    public final NodeInvokeReplier replier;

    @DebugMetadata(c = "com.facebook.aura.nodes.NodePinReminderDispatcher", f = "NodePinReminderDispatcher.kt", l = {69, 81, SelfieSnapshotKt.SELFIE_JPEG_QUALITY, SelfieSnapshotKt.SELFIE_JPEG_QUALITY, 100, 109}, m = "dispatch", v = 2)
    /* renamed from: com.facebook.aura.nodes.NodePinReminderDispatcher$dispatch$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NodePinReminderDispatcher.this.dispatch(null, null, null, this);
        }
    }

    public NodePinReminderDispatcher(NodeInvokeReplier nodeInvokeReplier) {
        C7384Etj.A0Y(nodeInvokeReplier, 0);
        this.replier = nodeInvokeReplier;
        this.presentations = C60O.A1C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object ackPresentation(String str, boolean z, String str2, HtJ<? super Unit> htJ) {
        if (!z) {
            return C3cG.A0U(replyError(str, "no_pin_state", "no authenticated PIN state for the invoked revision", htJ));
        }
        NodeInvokeReplier nodeInvokeReplier = this.replier;
        C2nw c2nwA1K = C60O.A1K();
        C7qW.A06(AuraDeeplinkRouteMapper.STATUS_ROUTE, str2, c2nwA1K);
        Unit unit = Unit.INSTANCE;
        Object objReply = nodeInvokeReplier.reply(str, true, c2nwA1K.A00(), null, null, htJ);
        return objReply != EnumC10460Hji.A02 ? unit : objReply;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cb, code lost:
    
        if (r0 == r2) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object dispatch(java.lang.String r14, kotlinx.serialization.json.JsonObject r15, java.lang.Long r16, X.HtJ<? super kotlin.Unit> r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.NodePinReminderDispatcher.dispatch(java.lang.String, kotlinx.serialization.json.JsonObject, java.lang.Long, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object replyError(String str, String str2, String str3, HtJ<? super Unit> htJ) {
        return C3cG.A0U(this.replier.reply(str, false, null, str2, str3, htJ));
    }

    private final long stateWaitMs(Long l) {
        return Math.max(0L, Math.min(l != null ? l.longValue() : 10000L, 10000L) - 1000);
    }

    public final NodePinReminderPresenter getPresenter() {
        return this.presenter;
    }

    public final void onConnected() {
        this.presentations.clear();
    }

    public final void setPresenter(NodePinReminderPresenter nodePinReminderPresenter) {
        this.presenter = nodePinReminderPresenter;
    }
}
