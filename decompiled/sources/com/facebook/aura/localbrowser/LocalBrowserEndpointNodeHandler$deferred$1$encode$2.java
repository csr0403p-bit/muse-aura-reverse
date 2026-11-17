package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HtJ;
import com.facebook.aura.iap.MC;
import com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler;
import com.hatch.browser.core.CommandReport;
import com.hatch.browser.protocol.PageReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler$deferred$1$encode$2", f = "LocalBrowserEndpointNodeHandler.kt", l = {528, MC.dcp_iap_android.__CONFIG__, 540, 543, 575}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserEndpointNodeHandler$deferred$1$encode$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super JsonObject>, Object> {
    public final /* synthetic */ byte[] $centralBlackholeBytes;
    public final /* synthetic */ String $commandName;
    public final /* synthetic */ long $deadline;
    public final /* synthetic */ Map<String, String> $hostState;
    public final /* synthetic */ String $id;
    public final /* synthetic */ AtomicBoolean $logged;
    public final /* synthetic */ byte[] $navigationBytes;
    public final /* synthetic */ PageReference $prepared;
    public final /* synthetic */ int $reportMaxBytes;
    public final /* synthetic */ AtomicReference<CommandReport> $retained;
    public final /* synthetic */ LocalBrowserTask $task;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ LocalBrowserEndpointNodeHandler.AnonymousClass1 this$0;
    public final /* synthetic */ LocalBrowserEndpointNodeHandler this$1;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler$deferred$1$encode$2$4", f = "LocalBrowserEndpointNodeHandler.kt", l = {577}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler$deferred$1$encode$2$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super JsonObject>, Object> {
        public final /* synthetic */ JsonObject $centralBlackhole;
        public final /* synthetic */ JsonObject $failure;
        public final /* synthetic */ CommandReport $held;
        public final /* synthetic */ String $id;
        public final /* synthetic */ Map<String, JsonElement> $navigation;
        public final /* synthetic */ PageReference $prepared;
        public final /* synthetic */ JsonObject $reportJson;
        public final /* synthetic */ LocalBrowserTask $task;
        public Object L$0;
        public int label;
        public final /* synthetic */ LocalBrowserEndpointNodeHandler.AnonymousClass1 this$0;
        public final /* synthetic */ LocalBrowserEndpointNodeHandler this$1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(LocalBrowserEndpointNodeHandler.AnonymousClass1 anonymousClass1, LocalBrowserTask localBrowserTask, JsonObject jsonObject, LocalBrowserEndpointNodeHandler localBrowserEndpointNodeHandler, String str, JsonObject jsonObject2, Map<String, ? extends JsonElement> map, CommandReport commandReport, JsonObject jsonObject3, PageReference pageReference, HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
            this.this$0 = anonymousClass1;
            this.$task = localBrowserTask;
            this.$failure = jsonObject;
            this.this$1 = localBrowserEndpointNodeHandler;
            this.$id = str;
            this.$centralBlackhole = jsonObject2;
            this.$navigation = map;
            this.$held = commandReport;
            this.$reportJson = jsonObject3;
            this.$prepared = pageReference;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass4(this.this$0, this.$task, this.$failure, this.this$1, this.$id, this.$centralBlackhole, this.$navigation, this.$held, this.$reportJson, this.$prepared, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 249
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler$deferred$1$encode$2.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super JsonObject> htJ) {
            return ((AnonymousClass4) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserEndpointNodeHandler$deferred$1$encode$2(AtomicReference<CommandReport> atomicReference, LocalBrowserEndpointNodeHandler.AnonymousClass1 anonymousClass1, byte[] bArr, LocalBrowserEndpointNodeHandler localBrowserEndpointNodeHandler, byte[] bArr2, int i, long j, AtomicBoolean atomicBoolean, LocalBrowserTask localBrowserTask, Map<String, String> map, String str, String str2, PageReference pageReference, HtJ<? super LocalBrowserEndpointNodeHandler$deferred$1$encode$2> htJ) {
        super(2, htJ);
        this.$retained = atomicReference;
        this.this$0 = anonymousClass1;
        this.$navigationBytes = bArr;
        this.this$1 = localBrowserEndpointNodeHandler;
        this.$centralBlackholeBytes = bArr2;
        this.$reportMaxBytes = i;
        this.$deadline = j;
        this.$logged = atomicBoolean;
        this.$task = localBrowserTask;
        this.$hostState = map;
        this.$id = str;
        this.$commandName = str2;
        this.$prepared = pageReference;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserEndpointNodeHandler$deferred$1$encode$2(this.$retained, this.this$0, this.$navigationBytes, this.this$1, this.$centralBlackholeBytes, this.$reportMaxBytes, this.$deadline, this.$logged, this.$task, this.$hostState, this.$id, this.$commandName, this.$prepared, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0144 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0221 A[RETURN] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.Map] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler$deferred$1$encode$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super JsonObject> htJ) {
        return ((LocalBrowserEndpointNodeHandler$deferred$1$encode$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
