package com.facebook.aura.composer.dictation.pcm;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C3357CGy;
import X.C3cG;
import X.HtJ;
import X.HzP;
import android.content.Context;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.composer.dictation.DictationEngineSelector;
import com.facebook.aura.composer.dictation.DictationEngineType;
import com.facebook.aura.composer.dictation.DictationGating;
import com.facebook.aura.composer.dictation.engine.DictationMode;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class PcmDictation {
    public static final int BURST_SAMPLES = 48000;
    public static final long CHUNK_PACE_MS = 50;
    public static final int CHUNK_SAMPLES = 2400;
    public static final PcmDictation INSTANCE = new PcmDictation();

    @DebugMetadata(c = "com.facebook.aura.composer.dictation.pcm.PcmDictation", f = "PcmDictation.kt", l = {MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS, 72, 75}, m = "transcribe", v = 2)
    /* renamed from: com.facebook.aura.composer.dictation.pcm.PcmDictation$transcribe$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PcmDictation.this.transcribe(null, null, null, null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r1 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.composer.dictation.pcm.PcmDictationStream start(X.AbstractC3358CGz r7, android.content.Context r8, java.lang.String r9) {
        /*
            r6 = this;
            r5 = 0
            boolean r4 = X.AnonymousClass002.A1a(r7, r8)
            r3 = 2
            X.C7384Etj.A0Y(r9, r3)
            com.facebook.aura.composer.dictation.DictationEngineType r0 = r6.engineType(r7)
            r2 = -1
            int r1 = X.AnonymousClass003.A0M(r0)
            r0 = 0
            if (r1 == r2) goto L3e
            if (r1 == r5) goto L20
            if (r1 == r3) goto L27
            if (r1 == r4) goto L3e
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L20:
            com.facebook.aura.composer.dictation.pcm.PcmDictationStream r1 = r6.startVoyager(r7, r8, r9)
            if (r1 == 0) goto L3e
            goto L2f
        L27:
            com.facebook.aura.composer.dictation.pcm.VmPcmStream r1 = new com.facebook.aura.composer.dictation.pcm.VmPcmStream
            r1.<init>(r7)
            r1.start()
        L2f:
            com.facebook.aura.composer.dictation.DictationLanguages r0 = com.facebook.aura.composer.dictation.DictationLanguages.INSTANCE
            boolean r0 = r0.prefersTraditionalChinese(r8)
            if (r0 == 0) goto L3d
            com.facebook.aura.composer.dictation.pcm.TraditionalChinesePcmStream r0 = new com.facebook.aura.composer.dictation.pcm.TraditionalChinesePcmStream
            r0.<init>(r1)
            return r0
        L3d:
            return r1
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.dictation.pcm.PcmDictation.start(X.CGz, android.content.Context, java.lang.String):com.facebook.aura.composer.dictation.pcm.PcmDictationStream");
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DictationEngineType.values().length];
            try {
                AnonymousClass002.A13(DictationEngineType.VOYAGER, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(DictationEngineType.VM, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(DictationEngineType.ON_DEVICE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final DictationEngineType engineType(AbstractC3358CGz abstractC3358CGz) {
        return DictationEngineSelector.INSTANCE.select(DictationMode.MANUAL, abstractC3358CGz, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f7 A[Catch: all -> 0x00fd, TRY_LEAVE, TryCatch #0 {all -> 0x00fd, blocks: (B:50:0x00de, B:51:0x00e1, B:53:0x00e5, B:55:0x00eb, B:57:0x00f1, B:58:0x00f7, B:39:0x0090, B:40:0x0093, B:44:0x00b0, B:47:0x00ca, B:30:0x0073, B:31:0x0076, B:33:0x007c, B:36:0x0082, B:27:0x0060), top: B:64:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ca A[EDGE_INSN: B:65:0x00ca->B:47:0x00ca BREAK  A[LOOP:0: B:40:0x0093->B:68:0x0093], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.facebook.aura.composer.dictation.pcm.PcmDictationStream, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object transcribe(X.AbstractC3358CGz r8, android.content.Context r9, short[] r10, java.lang.String r11, X.HtJ<? super com.facebook.aura.composer.dictation.pcm.PcmTranscription> r12) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.dictation.pcm.PcmDictation.transcribe(X.CGz, android.content.Context, short[], java.lang.String, X.HtJ):java.lang.Object");
    }

    private final boolean isAvailable(AbstractC3358CGz abstractC3358CGz) {
        int iA0M = AnonymousClass003.A0M(engineType(abstractC3358CGz));
        if (iA0M != -1) {
            if (iA0M == 0) {
                String strA0z = C3357CGy.A0z(abstractC3358CGz);
                return (strA0z == null || strA0z.length() == 0) ? false : true;
            }
            if (iA0M != 2) {
                if (iA0M != 1) {
                    throw C3cG.A0q();
                }
            }
        }
        return false;
    }

    private final PcmDictationStream startVoyager(AbstractC3358CGz abstractC3358CGz, Context context, String str) {
        String strA0z = C3357CGy.A0z(abstractC3358CGz);
        if (strA0z != null && strA0z.length() != 0) {
            VoyagerPcmStream voyagerPcmStream = new VoyagerPcmStream(str, DictationGating.INSTANCE.getVoyagerModelName(), new PcmDictation$startVoyager$stream$1(context));
            if (voyagerPcmStream.start(strA0z)) {
                return voyagerPcmStream;
            }
        }
        return null;
    }
}
