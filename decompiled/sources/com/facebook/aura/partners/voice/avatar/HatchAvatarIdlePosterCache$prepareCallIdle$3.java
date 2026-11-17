package com.facebook.aura.partners.voice.avatar;

import X.AbstractC07127nr;
import X.G0V;
import X.HtJ;
import com.facebook.aura.model.AvatarCallIdleVideo;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache$prepareCallIdle$3", f = "HatchAvatarIdlePosterCache.kt", l = {147, 153}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchAvatarIdlePosterCache$prepareCallIdle$3 extends AbstractC07127nr implements G0V<File, HtJ<? super HatchAvatarIdlePoster>, Object> {
    public final /* synthetic */ boolean $download;
    public final /* synthetic */ File $local;
    public final /* synthetic */ AvatarCallIdleVideo $video;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ HatchAvatarIdlePosterCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAvatarIdlePosterCache$prepareCallIdle$3(File file, boolean z, HatchAvatarIdlePosterCache hatchAvatarIdlePosterCache, AvatarCallIdleVideo avatarCallIdleVideo, HtJ<? super HatchAvatarIdlePosterCache$prepareCallIdle$3> htJ) {
        super(2, htJ);
        this.$local = file;
        this.$download = z;
        this.this$0 = hatchAvatarIdlePosterCache;
        this.$video = avatarCallIdleVideo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchAvatarIdlePosterCache$prepareCallIdle$3 hatchAvatarIdlePosterCache$prepareCallIdle$3 = new HatchAvatarIdlePosterCache$prepareCallIdle$3(this.$local, this.$download, this.this$0, this.$video, htJ);
        hatchAvatarIdlePosterCache$prepareCallIdle$3.L$0 = obj;
        return hatchAvatarIdlePosterCache$prepareCallIdle$3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        if (r9 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
    
        if (X.AnonymousClass001.A1X(r9) == false) goto L33;
     */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.Object r6 = r8.L$0
            java.io.File r6 = (java.io.File) r6
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r8.label
            r3 = 0
            r4 = 2
            r7 = 1
            if (r0 == 0) goto L17
            if (r0 == r7) goto L71
            if (r0 != r4) goto L12
            goto L59
        L12:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L17:
            X.Hwg.A00(r9)
            java.io.File r0 = r8.$local
            boolean r0 = r0.isFile()
            if (r0 != 0) goto L39
            boolean r0 = r8.$download
            if (r0 == 0) goto L7a
            com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache r2 = r8.this$0
            com.facebook.aura.model.AvatarCallIdleVideo r0 = r8.$video
            java.lang.String r1 = r0.url
            java.io.File r0 = r8.$local
            r8.L$0 = r6
            r8.label = r7
            java.lang.Object r9 = com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache.access$downloadCallIdle(r2, r1, r0, r8)
            if (r9 != r5) goto L74
            return r5
        L39:
            java.io.File r2 = r8.$local
            long r0 = java.lang.System.currentTimeMillis()
            r2.setLastModified(r0)
            com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache r0 = r8.this$0     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L7c
            com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePoster r9 = com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache.access$readPoster(r0, r6)     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L7c
            if (r9 != 0) goto L68
            com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache r1 = r8.this$0     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L7c
            java.io.File r0 = r8.$local     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L7c
            r8.L$0 = r3     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L7c
            r8.label = r4     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L7c
            java.lang.Object r9 = com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache.access$extractPoster(r1, r0, r6, r8)     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L7c
            if (r9 != r5) goto L5c
            goto L7b
        L59:
            X.Hwg.A00(r9)     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L7c
        L5c:
            com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePoster r9 = (com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePoster) r9     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L7c
            goto L68
        L5f:
            r2 = move-exception
            java.lang.String r1 = "Could not cut a poster from the call idle clip"
            java.lang.String r0 = "HatchAvatarIdlePoster"
            X.CFK.A0K(r0, r2, r1)
            goto L6b
        L68:
            r3 = r9
            if (r9 != 0) goto L7a
        L6b:
            java.io.File r0 = r8.$local
            r0.delete()
            return r3
        L71:
            X.Hwg.A00(r9)
        L74:
            boolean r0 = X.AnonymousClass001.A1X(r9)
            if (r0 != 0) goto L39
        L7a:
            return r3
        L7b:
            return r5
        L7c:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache$prepareCallIdle$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(File file, HtJ<? super HatchAvatarIdlePoster> htJ) {
        return ((HatchAvatarIdlePosterCache$prepareCallIdle$3) create(file, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
