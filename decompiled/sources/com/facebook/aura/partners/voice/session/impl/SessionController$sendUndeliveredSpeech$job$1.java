package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.C3UX;
import X.F1F;
import X.G0V;
import X.HtJ;
import com.facebook.aura.partners.voice.session.impl.SessionController;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$sendUndeliveredSpeech$job$1", f = "SessionController.kt", l = {1773, 1814}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class SessionController$sendUndeliveredSpeech$job$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Function0<Unit> $onNotSent;
    public final /* synthetic */ F1F $sent;
    public final /* synthetic */ SessionController.CapturedUndeliveredSpeech $speech;
    public long J$0;
    public long J$1;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public final /* synthetic */ SessionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionController$sendUndeliveredSpeech$job$1(SessionController.CapturedUndeliveredSpeech capturedUndeliveredSpeech, SessionController sessionController, F1F f1f, Function0<Unit> function0, HtJ<? super SessionController$sendUndeliveredSpeech$job$1> htJ) {
        super(2, htJ);
        this.$speech = capturedUndeliveredSpeech;
        this.this$0 = sessionController;
        this.$sent = f1f;
        this.$onNotSent = function0;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SessionController$sendUndeliveredSpeech$job$1(this.$speech, this.this$0, this.$sent, this.$onNotSent, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095 A[Catch: all -> 0x015b, DONT_GENERATE, PHI: r0 r1 r6 r7 r14
  0x0095: PHI (r0v15 X.Hqv) = (r0v12 X.Hqv), (r0v16 X.Hqv) binds: [B:30:0x0093, B:25:0x0088] A[DONT_GENERATE, DONT_INLINE]
  0x0095: PHI (r1v5 long) = (r1v2 long), (r1v6 long) binds: [B:30:0x0093, B:25:0x0088] A[DONT_GENERATE, DONT_INLINE]
  0x0095: PHI (r6v10 java.lang.Object) = (r6v5 java.lang.Object), (r6v12 java.lang.Object) binds: [B:30:0x0093, B:25:0x0088] A[DONT_GENERATE, DONT_INLINE]
  0x0095: PHI (r7v4 X.Hqv) = (r7v1 X.Hqv), (r7v5 X.Hqv) binds: [B:30:0x0093, B:25:0x0088] A[DONT_GENERATE, DONT_INLINE]
  0x0095: PHI (r14v5 com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption) = 
  (r14v2 com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption)
  (r14v6 com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption)
 binds: [B:30:0x0093, B:25:0x0088] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #4 {all -> 0x015b, blocks: (B:51:0x00f3, B:52:0x00f6, B:54:0x00fc, B:42:0x00b6, B:57:0x0106, B:59:0x012d, B:60:0x0131, B:62:0x013a, B:55:0x00ff, B:31:0x0095, B:32:0x0098, B:34:0x00a0, B:36:0x00a5, B:38:0x00a9, B:39:0x00ac, B:41:0x00b4, B:44:0x00bd, B:45:0x00c0, B:47:0x00d0, B:48:0x00d3, B:11:0x003a, B:13:0x0048, B:15:0x004c, B:18:0x0052, B:71:0x0157, B:72:0x015a, B:22:0x0081, B:23:0x0084, B:29:0x008c, B:19:0x005c, B:68:0x0153), top: B:76:0x000d, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0 A[Catch: all -> 0x015b, TryCatch #4 {all -> 0x015b, blocks: (B:51:0x00f3, B:52:0x00f6, B:54:0x00fc, B:42:0x00b6, B:57:0x0106, B:59:0x012d, B:60:0x0131, B:62:0x013a, B:55:0x00ff, B:31:0x0095, B:32:0x0098, B:34:0x00a0, B:36:0x00a5, B:38:0x00a9, B:39:0x00ac, B:41:0x00b4, B:44:0x00bd, B:45:0x00c0, B:47:0x00d0, B:48:0x00d3, B:11:0x003a, B:13:0x0048, B:15:0x004c, B:18:0x0052, B:71:0x0157, B:72:0x015a, B:22:0x0081, B:23:0x0084, B:29:0x008c, B:19:0x005c, B:68:0x0153), top: B:76:0x000d, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9 A[Catch: all -> 0x015b, TryCatch #4 {all -> 0x015b, blocks: (B:51:0x00f3, B:52:0x00f6, B:54:0x00fc, B:42:0x00b6, B:57:0x0106, B:59:0x012d, B:60:0x0131, B:62:0x013a, B:55:0x00ff, B:31:0x0095, B:32:0x0098, B:34:0x00a0, B:36:0x00a5, B:38:0x00a9, B:39:0x00ac, B:41:0x00b4, B:44:0x00bd, B:45:0x00c0, B:47:0x00d0, B:48:0x00d3, B:11:0x003a, B:13:0x0048, B:15:0x004c, B:18:0x0052, B:71:0x0157, B:72:0x015a, B:22:0x0081, B:23:0x0084, B:29:0x008c, B:19:0x005c, B:68:0x0153), top: B:76:0x000d, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac A[Catch: all -> 0x015b, TryCatch #4 {all -> 0x015b, blocks: (B:51:0x00f3, B:52:0x00f6, B:54:0x00fc, B:42:0x00b6, B:57:0x0106, B:59:0x012d, B:60:0x0131, B:62:0x013a, B:55:0x00ff, B:31:0x0095, B:32:0x0098, B:34:0x00a0, B:36:0x00a5, B:38:0x00a9, B:39:0x00ac, B:41:0x00b4, B:44:0x00bd, B:45:0x00c0, B:47:0x00d0, B:48:0x00d3, B:11:0x003a, B:13:0x0048, B:15:0x004c, B:18:0x0052, B:71:0x0157, B:72:0x015a, B:22:0x0081, B:23:0x0084, B:29:0x008c, B:19:0x005c, B:68:0x0153), top: B:76:0x000d, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc A[Catch: all -> 0x015b, TryCatch #4 {all -> 0x015b, blocks: (B:51:0x00f3, B:52:0x00f6, B:54:0x00fc, B:42:0x00b6, B:57:0x0106, B:59:0x012d, B:60:0x0131, B:62:0x013a, B:55:0x00ff, B:31:0x0095, B:32:0x0098, B:34:0x00a0, B:36:0x00a5, B:38:0x00a9, B:39:0x00ac, B:41:0x00b4, B:44:0x00bd, B:45:0x00c0, B:47:0x00d0, B:48:0x00d3, B:11:0x003a, B:13:0x0048, B:15:0x004c, B:18:0x0052, B:71:0x0157, B:72:0x015a, B:22:0x0081, B:23:0x0084, B:29:0x008c, B:19:0x005c, B:68:0x0153), top: B:76:0x000d, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ff A[Catch: all -> 0x015b, TRY_LEAVE, TryCatch #4 {all -> 0x015b, blocks: (B:51:0x00f3, B:52:0x00f6, B:54:0x00fc, B:42:0x00b6, B:57:0x0106, B:59:0x012d, B:60:0x0131, B:62:0x013a, B:55:0x00ff, B:31:0x0095, B:32:0x0098, B:34:0x00a0, B:36:0x00a5, B:38:0x00a9, B:39:0x00ac, B:41:0x00b4, B:44:0x00bd, B:45:0x00c0, B:47:0x00d0, B:48:0x00d3, B:11:0x003a, B:13:0x0048, B:15:0x004c, B:18:0x0052, B:71:0x0157, B:72:0x015a, B:22:0x0081, B:23:0x0084, B:29:0x008c, B:19:0x005c, B:68:0x0153), top: B:76:0x000d, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012d A[Catch: all -> 0x015b, TryCatch #4 {all -> 0x015b, blocks: (B:51:0x00f3, B:52:0x00f6, B:54:0x00fc, B:42:0x00b6, B:57:0x0106, B:59:0x012d, B:60:0x0131, B:62:0x013a, B:55:0x00ff, B:31:0x0095, B:32:0x0098, B:34:0x00a0, B:36:0x00a5, B:38:0x00a9, B:39:0x00ac, B:41:0x00b4, B:44:0x00bd, B:45:0x00c0, B:47:0x00d0, B:48:0x00d3, B:11:0x003a, B:13:0x0048, B:15:0x004c, B:18:0x0052, B:71:0x0157, B:72:0x015a, B:22:0x0081, B:23:0x0084, B:29:0x008c, B:19:0x005c, B:68:0x0153), top: B:76:0x000d, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013a A[Catch: all -> 0x015b, TryCatch #4 {all -> 0x015b, blocks: (B:51:0x00f3, B:52:0x00f6, B:54:0x00fc, B:42:0x00b6, B:57:0x0106, B:59:0x012d, B:60:0x0131, B:62:0x013a, B:55:0x00ff, B:31:0x0095, B:32:0x0098, B:34:0x00a0, B:36:0x00a5, B:38:0x00a9, B:39:0x00ac, B:41:0x00b4, B:44:0x00bd, B:45:0x00c0, B:47:0x00d0, B:48:0x00d3, B:11:0x003a, B:13:0x0048, B:15:0x004c, B:18:0x0052, B:71:0x0157, B:72:0x015a, B:22:0x0081, B:23:0x0084, B:29:0x008c, B:19:0x005c, B:68:0x0153), top: B:76:0x000d, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0140  */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, com.facebook.aura.partners.voice.session.impl.UndeliveredSpeechSource] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController$sendUndeliveredSpeech$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((SessionController$sendUndeliveredSpeech$job$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
