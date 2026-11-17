package com.facebook.aura.nodes.datasource;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class DataSourceContext extends C06G {
    public final String clientId;
    public final InvokeResultAck invokeAck;
    public final String requestId;
    public final DataSourcePublishSink sink;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.nodes.datasource.DataSourceContext", f = "DataSourceContext.kt", l = {44}, m = "ackBackfill", v = 2)
    /* renamed from: com.facebook.aura.nodes.datasource.DataSourceContext$ackBackfill$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DataSourceContext.this.ackBackfill(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nodes.datasource.DataSourceContext", f = "DataSourceContext.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft}, m = "publish", v = 2)
    /* renamed from: com.facebook.aura.nodes.datasource.DataSourceContext$publish$1, reason: invalid class name and case insensitive filesystem */
    public final class C127671 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C127671(HtJ<? super C127671> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DataSourceContext.this.publish(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nodes.datasource.DataSourceContext", f = "DataSourceContext.kt", l = {R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures}, m = "publishFrame", v = 2)
    /* renamed from: com.facebook.aura.nodes.datasource.DataSourceContext$publishFrame$1, reason: invalid class name and case insensitive filesystem */
    public final class C127681 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C127681(HtJ<? super C127681> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DataSourceContext.this.publishFrame(null, this);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DataSourceContext) {
                DataSourceContext dataSourceContext = (DataSourceContext) obj;
                if (!C7384Etj.areEqual(this.clientId, dataSourceContext.clientId) || !C7384Etj.areEqual(this.requestId, dataSourceContext.requestId) || !C7384Etj.areEqual(this.userSession, dataSourceContext.userSession) || !C7384Etj.areEqual(this.sink, dataSourceContext.sink) || !C7384Etj.areEqual(this.invokeAck, dataSourceContext.invokeAck)) {
                }
            }
            return false;
        }
        return true;
    }

    private final DataSourcePublishSink component4() {
        return this.sink;
    }

    private final InvokeResultAck component5() {
        return this.invokeAck;
    }

    public static /* synthetic */ DataSourceContext copy$default(DataSourceContext dataSourceContext, String str, String str2, AbstractC3358CGz abstractC3358CGz, DataSourcePublishSink dataSourcePublishSink, InvokeResultAck invokeResultAck, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dataSourceContext.clientId;
        }
        if ((i & 2) != 0) {
            str2 = dataSourceContext.requestId;
        }
        if ((i & 4) != 0) {
            abstractC3358CGz = dataSourceContext.userSession;
        }
        if ((i & 8) != 0) {
            dataSourcePublishSink = dataSourceContext.sink;
        }
        if ((i & 16) != 0) {
            invokeResultAck = dataSourceContext.invokeAck;
        }
        return dataSourceContext.copy(str, str2, abstractC3358CGz, dataSourcePublishSink, invokeResultAck);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ackBackfill(kotlinx.serialization.json.JsonObject r6, X.HtJ<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.nodes.datasource.DataSourceContext.AnonymousClass1
            if (r0 == 0) goto L3e
            r4 = r7
            com.facebook.aura.nodes.datasource.DataSourceContext$ackBackfill$1 r4 = (com.facebook.aura.nodes.datasource.DataSourceContext.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 != r2) goto L44
            X.Hwg.A00(r1)
        L20:
            boolean r0 = X.AnonymousClass001.A1X(r1)
        L24:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L29:
            X.Hwg.A00(r1)
            com.facebook.aura.nodes.datasource.InvokeResultAck r1 = r5.invokeAck
            if (r1 == 0) goto L3c
            r0 = 0
            r4.L$0 = r0
            r4.label = r2
            java.lang.Object r1 = r1.ack(r6, r4)
            if (r1 != r3) goto L20
            return r3
        L3c:
            r0 = 0
            goto L24
        L3e:
            com.facebook.aura.nodes.datasource.DataSourceContext$ackBackfill$1 r4 = new com.facebook.aura.nodes.datasource.DataSourceContext$ackBackfill$1
            r4.<init>(r7)
            goto L12
        L44:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.datasource.DataSourceContext.ackBackfill(kotlinx.serialization.json.JsonObject, X.HtJ):java.lang.Object");
    }

    public final String component1() {
        return this.clientId;
    }

    public final String component2() {
        return this.requestId;
    }

    public final AbstractC3358CGz component3() {
        return this.userSession;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final AbstractC3358CGz getUserSession() {
        return this.userSession;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.userSession, (AnonymousClass001.A0G(this.clientId) + AnonymousClass006.A0G(this.requestId)) * 31) + AnonymousClass006.A0D(this.sink)) * 31) + C3cH.A02(this.invokeAck);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object publish(java.lang.String r6, kotlinx.serialization.json.JsonObject r7, X.HtJ<? super java.lang.Boolean> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.facebook.aura.nodes.datasource.DataSourceContext.C127671
            if (r0 == 0) goto L3a
            r4 = r8
            com.facebook.aura.nodes.datasource.DataSourceContext$publish$1 r4 = (com.facebook.aura.nodes.datasource.DataSourceContext.C127671) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L27
            if (r0 != r2) goto L40
            X.Hwg.A00(r1)
        L20:
            boolean r0 = r1 instanceof com.facebook.aura.nodes.datasource.DataSourceResult.Ok
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L27:
            X.Hwg.A00(r1)
            com.facebook.aura.nodes.datasource.DataSourcePublishPipeline r1 = com.facebook.aura.nodes.datasource.DataSourcePublishPipeline.INSTANCE
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.label = r2
            java.lang.Object r1 = r1.publishProactive(r5, r6, r7, r4)
            if (r1 != r3) goto L20
            return r3
        L3a:
            com.facebook.aura.nodes.datasource.DataSourceContext$publish$1 r4 = new com.facebook.aura.nodes.datasource.DataSourceContext$publish$1
            r4.<init>(r8)
            goto L12
        L40:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.datasource.DataSourceContext.publish(java.lang.String, kotlinx.serialization.json.JsonObject, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object publishFrame(com.facebook.aura.nodes.json.ClientDataSourcePublishParamsJson r6, X.HtJ<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.nodes.datasource.DataSourceContext.C127681
            if (r0 == 0) goto L3e
            r4 = r7
            com.facebook.aura.nodes.datasource.DataSourceContext$publishFrame$1 r4 = (com.facebook.aura.nodes.datasource.DataSourceContext.C127681) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 != r2) goto L44
            X.Hwg.A00(r1)
        L20:
            boolean r0 = X.AnonymousClass001.A1X(r1)
        L24:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L29:
            X.Hwg.A00(r1)
            com.facebook.aura.nodes.datasource.DataSourcePublishSink r1 = r5.sink
            if (r1 == 0) goto L3c
            r0 = 0
            r4.L$0 = r0
            r4.label = r2
            java.lang.Object r1 = r1.publish(r6, r4)
            if (r1 != r3) goto L20
            return r3
        L3c:
            r0 = 0
            goto L24
        L3e:
            com.facebook.aura.nodes.datasource.DataSourceContext$publishFrame$1 r4 = new com.facebook.aura.nodes.datasource.DataSourceContext$publishFrame$1
            r4.<init>(r7)
            goto L12
        L44:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.datasource.DataSourceContext.publishFrame(com.facebook.aura.nodes.json.ClientDataSourcePublishParamsJson, X.HtJ):java.lang.Object");
    }

    public DataSourceContext(String str, String str2, AbstractC3358CGz abstractC3358CGz, DataSourcePublishSink dataSourcePublishSink, InvokeResultAck invokeResultAck) {
        AnonymousClass003.A0v(str, abstractC3358CGz);
        this.clientId = str;
        this.requestId = str2;
        this.userSession = abstractC3358CGz;
        this.sink = dataSourcePublishSink;
        this.invokeAck = invokeResultAck;
    }

    public final DataSourceContext copy(String str, String str2, AbstractC3358CGz abstractC3358CGz, DataSourcePublishSink dataSourcePublishSink, InvokeResultAck invokeResultAck) {
        AnonymousClass003.A0v(str, abstractC3358CGz);
        return new DataSourceContext(str, str2, abstractC3358CGz, dataSourcePublishSink, invokeResultAck);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ DataSourceContext(String str, String str2, AbstractC3358CGz abstractC3358CGz, DataSourcePublishSink dataSourcePublishSink, InvokeResultAck invokeResultAck, int i, C06H c06h) {
        this(str, str2, abstractC3358CGz, (i & 8) != 0 ? null : dataSourcePublishSink, (i & 16) != 0 ? null : invokeResultAck);
    }
}
