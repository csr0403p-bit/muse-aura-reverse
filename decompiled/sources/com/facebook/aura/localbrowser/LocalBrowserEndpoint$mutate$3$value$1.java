package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C3UX;
import X.C3cH;
import X.C3cJ;
import X.C7438Evz;
import X.DBJ;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAX;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.localbrowser.LocalBrowserEndpoint;
import com.facebook.aura.nodes.api.HatchNodeInvocation;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserEndpoint$mutate$3$value$1", f = "LocalBrowserEndpoint.kt", l = {246}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserEndpoint$mutate$3$value$1 extends AbstractC07127nr implements G0U<HtJ<? super JsonObject>, Object> {
    public final /* synthetic */ long $deadline;
    public final /* synthetic */ HatchNodeInvocation $invocation;
    public final /* synthetic */ LocalBrowserEndpoint.Journal $journal;
    public final /* synthetic */ String $method;
    public final /* synthetic */ JsonObject $params;
    public int label;
    public final /* synthetic */ LocalBrowserEndpoint this$0;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserEndpoint$mutate$3$value$1$1", f = "LocalBrowserEndpoint.kt", l = {251, 252, 253, 257, 259}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserEndpoint$mutate$3$value$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super JsonObject>, Object> {
        public final /* synthetic */ long $deadline;
        public final /* synthetic */ HatchNodeInvocation $invocation;
        public final /* synthetic */ LocalBrowserEndpoint.Journal $journal;
        public final /* synthetic */ String $method;
        public final /* synthetic */ JsonObject $params;
        public int label;
        public final /* synthetic */ LocalBrowserEndpoint this$0;

        /* renamed from: com.facebook.aura.localbrowser.LocalBrowserEndpoint$mutate$3$value$1$1$1, reason: invalid class name and collision with other inner class name */
        public final /* synthetic */ class C02001 extends C7438Evz implements G0U<JsonObject, JsonObject> {
            public C02001(Object obj) {
                super(1, obj, LocalBrowserBlockedPolicy.class, DBJ.FIRST_RUN_INSTALL, "install(Lkotlinx/serialization/json/JsonObject;)Lkotlinx/serialization/json/JsonObject;", 0);
            }

            @Override // X.G0U
            public final JsonObject invoke(JsonObject jsonObject) {
                return ((LocalBrowserBlockedPolicy) AnonymousClass006.A0o(jsonObject, this)).install(jsonObject);
            }
        }

        /* renamed from: com.facebook.aura.localbrowser.LocalBrowserEndpoint$mutate$3$value$1$1$2, reason: invalid class name */
        public final /* synthetic */ class AnonymousClass2 extends C7438Evz implements G0U<JsonObject, JsonObject> {
            public AnonymousClass2(Object obj) {
                super(1, obj, LocalBrowserHeaderPolicy.class, DBJ.FIRST_RUN_INSTALL, "install(Lkotlinx/serialization/json/JsonObject;)Lkotlinx/serialization/json/JsonObject;", 0);
            }

            @Override // X.G0U
            public final JsonObject invoke(JsonObject jsonObject) {
                return ((LocalBrowserHeaderPolicy) AnonymousClass006.A0o(jsonObject, this)).install(jsonObject);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchNodeInvocation hatchNodeInvocation, LocalBrowserEndpoint localBrowserEndpoint, LocalBrowserEndpoint.Journal journal, String str, JsonObject jsonObject, long j, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$invocation = hatchNodeInvocation;
            this.this$0 = localBrowserEndpoint;
            this.$journal = journal;
            this.$method = str;
            this.$params = jsonObject;
            this.$deadline = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$invocation, this.this$0, this.$journal, this.$method, this.$params, this.$deadline, htJ);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00fd A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 300
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserEndpoint$mutate$3$value$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super JsonObject> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserEndpoint$mutate$3$value$1(long j, HatchNodeInvocation hatchNodeInvocation, LocalBrowserEndpoint localBrowserEndpoint, LocalBrowserEndpoint.Journal journal, String str, JsonObject jsonObject, HtJ<? super LocalBrowserEndpoint$mutate$3$value$1> htJ) {
        super(1, htJ);
        this.$deadline = j;
        this.$invocation = hatchNodeInvocation;
        this.this$0 = localBrowserEndpoint;
        this.$journal = journal;
        this.$method = str;
        this.$params = jsonObject;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new LocalBrowserEndpoint$mutate$3$value$1(this.$deadline, this.$invocation, this.this$0, this.$journal, this.$method, this.$params, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws LocalBrowserEndpointFailure {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            long j = this.$deadline;
            long jA04 = C3cH.A04(j);
            if (jA04 < 1) {
                jA04 = 1;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$invocation, this.this$0, this.$journal, this.$method, this.$params, j, null);
            this.label = 1;
            obj = GAX.A00(this, anonymousClass1, jA04);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        HatchNodeInvocation hatchNodeInvocation = this.$invocation;
        LocalBrowserEndpoint localBrowserEndpoint = this.this$0;
        LocalBrowserEndpoint.Journal journal = this.$journal;
        if (AnonymousClass003.A1Y(hatchNodeInvocation.isConnectionCurrent) && localBrowserEndpoint.isCurrent(journal.generation)) {
            return obj;
        }
        throw C3cJ.A08(true);
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super JsonObject> htJ) {
        return ((LocalBrowserEndpoint$mutate$3$value$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
