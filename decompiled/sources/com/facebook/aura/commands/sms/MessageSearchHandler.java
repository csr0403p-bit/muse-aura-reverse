package com.facebook.aura.commands.sms;

import X.A6B;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C0881AGi;
import X.C2nw;
import X.C3UX;
import X.C3cG;
import X.C60Q;
import X.C7pd;
import X.C7qW;
import X.C8d6;
import X.C9oY;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HtJ;
import android.content.Context;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandResponse;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.core.NodeExecutionContext;
import com.facebook.aura.nodes.datasource.NodeSyncTimestamps;
import com.facebook.aura.nodes.registry.HatchNodeCommandContext;
import com.facebook.aura.nodes.registry.HatchNodeCommandHandler;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public final class MessageSearchHandler implements HatchNodeCommandHandler {
    public static final MessageSearchHandler INSTANCE = new MessageSearchHandler();

    @DebugMetadata(c = "com.facebook.aura.commands.sms.MessageSearchHandler$execute$2", f = "MessageSearchHandler.kt", l = {105, 124, 138, 145, 152, 162, 171, 186, 192, 218, 226, 237, 245, 257, 268}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.sms.MessageSearchHandler$execute$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super NodeCommandResponse>, Object> {
        public final /* synthetic */ HatchNodeCommandContext $commandContext;
        public final /* synthetic */ NodeExecutionContext $ctx;
        public final /* synthetic */ String $paramsJson;
        public int I$0;
        public long J$0;
        public long J$1;
        public long J$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public boolean Z$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchNodeCommandContext hatchNodeCommandContext, String str, NodeExecutionContext nodeExecutionContext, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$commandContext = hatchNodeCommandContext;
            this.$paramsJson = str;
            this.$ctx = nodeExecutionContext;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$commandContext, this.$paramsJson, this.$ctx, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:106:0x038d  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x03ce  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x03d9  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x03e8  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x03e9  */
        /* JADX WARN: Removed duplicated region for block: B:150:0x0335 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0102 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01d8  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01d9 A[Catch: Exception -> 0x040d, TryCatch #2 {Exception -> 0x040d, blocks: (B:61:0x01d1, B:62:0x01d4, B:78:0x0236, B:81:0x0244, B:82:0x0248, B:84:0x0299, B:89:0x02d6, B:93:0x02fe, B:94:0x030c, B:96:0x0312, B:97:0x0320, B:109:0x0396, B:111:0x039c, B:115:0x03d3, B:118:0x03db, B:123:0x03ed, B:99:0x0352, B:104:0x036f, B:108:0x0392, B:65:0x01d9, B:67:0x01e1, B:71:0x021a, B:70:0x0217, B:88:0x02d3, B:92:0x02fb, B:103:0x036c, B:107:0x038f, B:114:0x03d0, B:53:0x01a1, B:55:0x01a7, B:57:0x01ad, B:58:0x01b2), top: B:154:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0244 A[Catch: Exception -> 0x040d, TRY_ENTER, TryCatch #2 {Exception -> 0x040d, blocks: (B:61:0x01d1, B:62:0x01d4, B:78:0x0236, B:81:0x0244, B:82:0x0248, B:84:0x0299, B:89:0x02d6, B:93:0x02fe, B:94:0x030c, B:96:0x0312, B:97:0x0320, B:109:0x0396, B:111:0x039c, B:115:0x03d3, B:118:0x03db, B:123:0x03ed, B:99:0x0352, B:104:0x036f, B:108:0x0392, B:65:0x01d9, B:67:0x01e1, B:71:0x021a, B:70:0x0217, B:88:0x02d3, B:92:0x02fb, B:103:0x036c, B:107:0x038f, B:114:0x03d0, B:53:0x01a1, B:55:0x01a7, B:57:0x01ad, B:58:0x01b2), top: B:154:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0299 A[Catch: Exception -> 0x040d, TryCatch #2 {Exception -> 0x040d, blocks: (B:61:0x01d1, B:62:0x01d4, B:78:0x0236, B:81:0x0244, B:82:0x0248, B:84:0x0299, B:89:0x02d6, B:93:0x02fe, B:94:0x030c, B:96:0x0312, B:97:0x0320, B:109:0x0396, B:111:0x039c, B:115:0x03d3, B:118:0x03db, B:123:0x03ed, B:99:0x0352, B:104:0x036f, B:108:0x0392, B:65:0x01d9, B:67:0x01e1, B:71:0x021a, B:70:0x0217, B:88:0x02d3, B:92:0x02fb, B:103:0x036c, B:107:0x038f, B:114:0x03d0, B:53:0x01a1, B:55:0x01a7, B:57:0x01ad, B:58:0x01b2), top: B:154:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:87:0x02d0  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x02f9  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0312 A[Catch: Exception -> 0x040d, LOOP:0: B:94:0x030c->B:96:0x0312, LOOP_END, TryCatch #2 {Exception -> 0x040d, blocks: (B:61:0x01d1, B:62:0x01d4, B:78:0x0236, B:81:0x0244, B:82:0x0248, B:84:0x0299, B:89:0x02d6, B:93:0x02fe, B:94:0x030c, B:96:0x0312, B:97:0x0320, B:109:0x0396, B:111:0x039c, B:115:0x03d3, B:118:0x03db, B:123:0x03ed, B:99:0x0352, B:104:0x036f, B:108:0x0392, B:65:0x01d9, B:67:0x01e1, B:71:0x021a, B:70:0x0217, B:88:0x02d3, B:92:0x02fb, B:103:0x036c, B:107:0x038f, B:114:0x03d0, B:53:0x01a1, B:55:0x01a7, B:57:0x01ad, B:58:0x01b2), top: B:154:0x000c }] */
        /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r33) {
            /*
                Method dump skipped, instructions count: 1252
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.sms.MessageSearchHandler.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super NodeCommandResponse> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.commands.sms.MessageSearchHandler$unreadAttachmentCandidates$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<CanonicalSmsMessage, Boolean> {
        public final /* synthetic */ Set<String> $matchedIds;

        /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
        @Override // X.G0U
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(com.facebook.aura.commands.sms.CanonicalSmsMessage r2) {
            /*
                r1 = this;
                r0 = 0
                X.C7384Etj.A0Y(r2, r0)
                java.util.List<com.facebook.aura.commands.sms.SmsAttachment> r0 = r2.attachments
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L17
                java.util.Set<java.lang.String> r1 = r1.$matchedIds
                java.lang.String r0 = r2.messageId
                boolean r1 = r1.contains(r0)
                r0 = 1
                if (r1 == 0) goto L18
            L17:
                r0 = 0
            L18:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.sms.MessageSearchHandler.AnonymousClass1.invoke(com.facebook.aura.commands.sms.CanonicalSmsMessage):java.lang.Boolean");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Set<String> set) {
            super(1);
            this.$matchedIds = set;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JsonObject buildResultPayload$default(MessageSearchHandler messageSearchHandler, List list, long j, long j2, long j3, boolean z, List list2, int i, Object obj) {
        if ((i & 32) != 0) {
            list2 = C0881AGi.A00;
        }
        return messageSearchHandler.buildResultPayload(list, j, j2, j3, z, list2);
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandId getCommandId() {
        return NodeCommandId.MESSAGE_SEARCH;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public HatchNodeCommandHandler getHandler() {
        return this;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ boolean getOnlySendsCard() {
        return false;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandSpec getSpec() {
        return SmsCommandSpecs.MESSAGE_SEARCH;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ boolean isEnabled() {
        return true;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ String validateParams(String str) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonObject buildResultPayload(List<CanonicalSmsMessage> list, long j, long j2, long j3, boolean z, List<CanonicalSmsMessage> list2) {
        C2nw c2nwA02 = C7qW.A02();
        C7qW.A05(Long.valueOf(j), "syncedAtMs", c2nwA02);
        NodeSyncTimestamps nodeSyncTimestamps = NodeSyncTimestamps.INSTANCE;
        C7qW.A06("requestedWindowStart", nodeSyncTimestamps.iso8601Utc(j2), c2nwA02);
        C7qW.A06("requestedWindowEnd", nodeSyncTimestamps.iso8601Utc(j3), c2nwA02);
        C7qW.A05(C60Q.A0W(list), "returnedCount", c2nwA02);
        boolean z2 = list.size() >= 100;
        C7qW.A0A("truncated", c2nwA02, z2);
        C7qW.A06("resultOrder", z ? "newest_first" : "relevance", c2nwA02);
        if (z2 && z) {
            Iterator<CanonicalSmsMessage> it = list.iterator();
            if (it.hasNext()) {
                Long lValueOf = Long.valueOf(it.next().timestampMs);
                while (it.hasNext()) {
                    Long lValueOf2 = Long.valueOf(it.next().timestampMs);
                    if (lValueOf.compareTo(lValueOf2) > 0) {
                        lValueOf = lValueOf2;
                    }
                }
                C7qW.A06("oldestReturned", nodeSyncTimestamps.iso8601Utc(lValueOf.longValue()), c2nwA02);
            }
        }
        C7pd c7pdA01 = C7pd.A01();
        Iterator<CanonicalSmsMessage> it2 = list.iterator();
        while (it2.hasNext()) {
            c7pdA01.A06(it2.next().toJson());
        }
        c2nwA02.A01("messages", C7pd.A00(c7pdA01));
        if (!list2.isEmpty()) {
            C7pd c7pdA012 = C7pd.A01();
            Iterator<CanonicalSmsMessage> it3 = list2.iterator();
            while (it3.hasNext()) {
                c7pdA012.A06(it3.next().toJson());
            }
            c2nwA02.A01("attachmentCandidates", C7pd.A00(c7pdA012));
        }
        return c2nwA02.A00();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String stringParam(JsonObject jsonObject, String str) {
        JsonPrimitive jsonPrimitive;
        String strA04;
        Object obj = jsonObject.get(str);
        if (!(obj instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) obj) == null || (strA04 = C9oY.A04(jsonPrimitive)) == null || strA04.length() <= 0) {
            return null;
        }
        return strA04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CanonicalSmsMessage> unreadAttachmentCandidates(List<CanonicalSmsMessage> list, List<CanonicalSmsMessage> list2) {
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        Iterator<CanonicalSmsMessage> it = list2.iterator();
        while (it.hasNext()) {
            linkedHashSetA0k.add(it.next().messageId);
        }
        return A6B.A02(A6B.A07(new C8d6(new Comparator() { // from class: com.facebook.aura.commands.sms.MessageSearchHandler$unreadAttachmentCandidates$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C60Q.A01(Long.valueOf(((CanonicalSmsMessage) t2).timestampMs), ((CanonicalSmsMessage) t).timestampMs);
            }
        }, A6B.A03(new AnonymousClass1(linkedHashSetA0k), AbstractC0878AGe.A06(list))), 10));
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public Object execute(AbstractC3358CGz abstractC3358CGz, HatchNodeCommandContext hatchNodeCommandContext, String str, NodeExecutionContext nodeExecutionContext, HtJ<? super NodeCommandResponse> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(hatchNodeCommandContext, str, nodeExecutionContext, null));
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ Object optionalDevicePermissions(String str, Context context, HtJ<? super List<String>> htJ) {
        return null;
    }
}
