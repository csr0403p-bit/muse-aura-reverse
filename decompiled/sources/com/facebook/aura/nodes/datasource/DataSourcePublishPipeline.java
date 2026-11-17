package com.facebook.aura.nodes.datasource;

import X.AGH;
import X.AnonymousClass005;
import X.HtJ;
import X.HzP;
import com.facebook.aura.feed.view.FeedEditHapticsKt;
import com.facebook.aura.nodes.json.ClientDataSourcePublishParamsJson;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes6.dex */
public final class DataSourcePublishPipeline {
    public static final DataSourcePublishPipeline INSTANCE = new DataSourcePublishPipeline();

    public final class ChunkStream {
        public int index;
        public ClientDataSourcePublishParamsJson pending;
        public final String producerId;
        public final String reconciliationId;
        public int rejected;
        public int skipped;
        public final String sourceId;
        public long totalBytes;
        public boolean warnedBytes;
        public boolean warnedChunks;

        /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x014f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0150  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(com.facebook.aura.nodes.datasource.DataSourceContext r18, java.lang.String r19, long r20, X.HtJ<? super kotlin.Unit> r22) {
            /*
                Method dump skipped, instructions count: 348
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.datasource.DataSourcePublishPipeline.ChunkStream.emit(com.facebook.aura.nodes.datasource.DataSourceContext, java.lang.String, long, X.HtJ):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00d2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object flushFinal(com.facebook.aura.nodes.datasource.DataSourceContext r18, java.lang.String r19, X.HtJ<? super kotlin.Unit> r20) {
            /*
                Method dump skipped, instructions count: 222
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.datasource.DataSourcePublishPipeline.ChunkStream.flushFinal(com.facebook.aura.nodes.datasource.DataSourceContext, java.lang.String, X.HtJ):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object flushPending(com.facebook.aura.nodes.datasource.DataSourceContext r6, X.HtJ<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.facebook.aura.nodes.datasource.DataSourcePublishPipeline$ChunkStream$flushPending$1
                if (r0 == 0) goto L47
                r4 = r7
                com.facebook.aura.nodes.datasource.DataSourcePublishPipeline$ChunkStream$flushPending$1 r4 = (com.facebook.aura.nodes.datasource.DataSourcePublishPipeline$ChunkStream$flushPending$1) r4
                int r2 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L47
                int r2 = r2 - r1
                r4.label = r2
            L12:
                java.lang.Object r1 = r4.result
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r4.label
                r2 = 1
                if (r0 == 0) goto L32
                if (r0 != r2) goto L4d
                X.Hwg.A00(r1)
            L20:
                boolean r0 = X.AnonymousClass001.A1X(r1)
                if (r0 != 0) goto L2c
                int r0 = r5.rejected
                int r0 = r0 + 1
                r5.rejected = r0
            L2c:
                r0 = 0
                r5.pending = r0
            L2f:
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                return r3
            L32:
                X.Hwg.A00(r1)
                com.facebook.aura.nodes.json.ClientDataSourcePublishParamsJson r1 = r5.pending
                if (r1 == 0) goto L2f
                r0 = 0
                r4.L$0 = r0
                r4.L$1 = r0
                r4.label = r2
                java.lang.Object r1 = r6.publishFrame(r1, r4)
                if (r1 != r3) goto L20
                return r3
            L47:
                com.facebook.aura.nodes.datasource.DataSourcePublishPipeline$ChunkStream$flushPending$1 r4 = new com.facebook.aura.nodes.datasource.DataSourcePublishPipeline$ChunkStream$flushPending$1
                r4.<init>(r5, r7)
                goto L12
            L4d:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.datasource.DataSourcePublishPipeline.ChunkStream.flushPending(com.facebook.aura.nodes.datasource.DataSourceContext, X.HtJ):java.lang.Object");
        }

        public final int getAttempted() {
            return this.index;
        }

        public final int getRejected() {
            return this.rejected;
        }

        public final int getSkipped() {
            return this.skipped;
        }

        public final String getSourceId() {
            return this.sourceId;
        }

        public ChunkStream(String str, String str2, String str3) {
            AnonymousClass005.A0x(str, str2, str3);
            this.producerId = str;
            this.sourceId = str2;
            this.reconciliationId = str3;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nodes.datasource.DataSourcePublishPipeline", f = "DataSourcePublishPipeline.kt", l = {224, 234, 238, 240, 243}, m = "deliver", v = 2)
    /* renamed from: com.facebook.aura.nodes.datasource.DataSourcePublishPipeline$deliver$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public long J$1;
        public long J$2;
        public long J$3;
        public long J$4;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DataSourcePublishPipeline.this.deliver(null, null, 0L, 0L, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nodes.datasource.DataSourcePublishPipeline", f = "DataSourcePublishPipeline.kt", l = {130, 140, 153, 166, 177, FeedEditHapticsKt.ZIP_PULSE_AMPLITUDE}, m = "deliverPaged", v = 2)
    /* renamed from: com.facebook.aura.nodes.datasource.DataSourcePublishPipeline$deliverPaged$1, reason: invalid class name and case insensitive filesystem */
    public final class C127691 extends HzP {
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public C127691(HtJ<? super C127691> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DataSourcePublishPipeline.this.deliverPaged(null, null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nodes.datasource.DataSourcePublishPipeline", f = "DataSourcePublishPipeline.kt", l = {HatchMessageShareDocumentRenderer.MIN_CONTENT_HEIGHT_PX, 315, 323}, m = "publishPage", v = 2)
    /* renamed from: com.facebook.aura.nodes.datasource.DataSourcePublishPipeline$publishPage$1, reason: invalid class name and case insensitive filesystem */
    public final class C127701 extends HzP {
        public int I$0;
        public long J$0;
        public long J$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C127701(HtJ<? super C127701> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DataSourcePublishPipeline.this.publishPage(null, null, 0L, 0, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nodes.datasource.DataSourcePublishPipeline", f = "DataSourcePublishPipeline.kt", l = {89}, m = "publishProactive", v = 2)
    /* renamed from: com.facebook.aura.nodes.datasource.DataSourcePublishPipeline$publishProactive$1, reason: invalid class name and case insensitive filesystem */
    public final class C127711 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public C127711(HtJ<? super C127711> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DataSourcePublishPipeline.this.publishProactive(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nodes.datasource.DataSourcePublishPipeline", f = "DataSourcePublishPipeline.kt", l = {272, 276, 277, 284, 285, 294}, m = "publishWindow", v = 2)
    /* renamed from: com.facebook.aura.nodes.datasource.DataSourcePublishPipeline$publishWindow$1, reason: invalid class name and case insensitive filesystem */
    public final class C127721 extends HzP {
        public long J$0;
        public long J$1;
        public long J$2;
        public long J$3;
        public long J$4;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C127721(HtJ<? super C127721> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DataSourcePublishPipeline.this.publishWindow(null, null, 0L, 0L, null, this);
        }
    }

    private final JsonObject mergeStub(JsonObject jsonObject, JsonObject jsonObject2) {
        return jsonObject2 == null ? jsonObject : new JsonObject(AGH.A02(jsonObject, jsonObject2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object publishPage(com.facebook.aura.nodes.datasource.DataSourceContext r15, com.facebook.aura.nodes.datasource.PagedBackfillStrategy r16, long r17, int r19, com.facebook.aura.nodes.datasource.DataSourcePublishPipeline.ChunkStream r20, X.HtJ<? super com.facebook.aura.nodes.datasource.BackfillPage> r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.datasource.DataSourcePublishPipeline.publishPage(com.facebook.aura.nodes.datasource.DataSourceContext, com.facebook.aura.nodes.datasource.PagedBackfillStrategy, long, int, com.facebook.aura.nodes.datasource.DataSourcePublishPipeline$ChunkStream, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01cc A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object publishWindow(com.facebook.aura.nodes.datasource.DataSourceContext r17, com.facebook.aura.nodes.datasource.BackfillStrategy r18, long r19, long r21, com.facebook.aura.nodes.datasource.DataSourcePublishPipeline.ChunkStream r23, X.HtJ<? super kotlin.Unit> r24) throws com.facebook.aura.nodes.datasource.BackfillWindowNeedsSplitException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.datasource.DataSourcePublishPipeline.publishWindow(com.facebook.aura.nodes.datasource.DataSourceContext, com.facebook.aura.nodes.datasource.BackfillStrategy, long, long, com.facebook.aura.nodes.datasource.DataSourcePublishPipeline$ChunkStream, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x014e, code lost:
    
        if (r11 != r9) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0094 -> B:26:0x00a3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deliverPaged(com.facebook.aura.nodes.datasource.DataSourceContext r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, com.facebook.aura.nodes.datasource.PagedBackfillStrategy r24, X.HtJ<? super com.facebook.aura.nodes.datasource.DataSourceResult> r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.datasource.DataSourcePublishPipeline.deliverPaged(com.facebook.aura.nodes.datasource.DataSourceContext, java.lang.String, java.lang.String, java.lang.String, com.facebook.aura.nodes.datasource.PagedBackfillStrategy, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object publishProactive(com.facebook.aura.nodes.datasource.DataSourceContext r17, java.lang.String r18, kotlinx.serialization.json.JsonObject r19, X.HtJ<? super com.facebook.aura.nodes.datasource.DataSourceResult> r20) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.datasource.DataSourcePublishPipeline.publishProactive(com.facebook.aura.nodes.datasource.DataSourceContext, java.lang.String, kotlinx.serialization.json.JsonObject, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0207: INVOKE (r1 I:java.lang.Object) = 
  (r14 I:com.facebook.aura.nodes.datasource.DataSourcePublishPipeline$ChunkStream)
  (r4 I:com.facebook.aura.nodes.datasource.DataSourceContext)
  (r6 I:X.HtJ)
 VIRTUAL call: com.facebook.aura.nodes.datasource.DataSourcePublishPipeline.ChunkStream.flushPending(com.facebook.aura.nodes.datasource.DataSourceContext, X.HtJ):java.lang.Object A[MD:(com.facebook.aura.nodes.datasource.DataSourceContext, X.HtJ<? super kotlin.Unit>):java.lang.Object (m)], block:B:59:0x01e6 */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0181 A[Catch: BackfillWindowNeedsSplitException -> 0x01e6, TryCatch #0 {BackfillWindowNeedsSplitException -> 0x01e6, blocks: (B:22:0x006c, B:24:0x008b, B:44:0x0142, B:48:0x0181, B:50:0x0185, B:53:0x01ad, B:55:0x01b3, B:56:0x01ba), top: B:76:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0210  */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.facebook.aura.nodes.datasource.DataSourcePublishPipeline$ChunkStream] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x017b -> B:47:0x017f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deliver(com.facebook.aura.nodes.datasource.DataSourceContext r29, java.lang.String r30, long r31, long r33, java.lang.String r35, java.lang.String r36, com.facebook.aura.nodes.datasource.BackfillStrategy r37, X.HtJ<? super com.facebook.aura.nodes.datasource.DataSourceResult> r38) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.datasource.DataSourcePublishPipeline.deliver(com.facebook.aura.nodes.datasource.DataSourceContext, java.lang.String, long, long, java.lang.String, java.lang.String, com.facebook.aura.nodes.datasource.BackfillStrategy, X.HtJ):java.lang.Object");
    }
}
