package com.facebook.aura.header.view;

import X.Akx;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C1251Afj;
import X.C3UX;
import X.HoC;
import X.HtJ;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class AvatarScrollConnection implements Akx {
    public long lastScrollTimeMs;
    public final HatchAvatarPlaybackState playback;
    public HoC resumeJob;
    public final C3UX scope;

    public final void dispose() {
        AnonymousClass002.A1K(this.resumeJob);
        this.playback.setPaused$fbandroid_express_aura_java_com_facebook_aura_header_view_view(this, false);
    }

    @Override // X.Akx
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo6onPreScrollOzD1aCk(long j, int i) {
        if (j != 0) {
            this.lastScrollTimeMs = SystemClock.uptimeMillis();
            HoC hoC = this.resumeJob;
            if (hoC == null || !hoC.isActive()) {
                this.playback.setPaused$fbandroid_express_aura_java_com_facebook_aura_header_view_view(this, true);
                this.resumeJob = AnonymousClass001.A11(new AvatarScrollConnection$onPreScroll$1(this, null), this.scope);
                return 0L;
            }
        }
        return 0L;
    }

    public AvatarScrollConnection(HatchAvatarPlaybackState hatchAvatarPlaybackState, C3UX c3ux) {
        AnonymousClass003.A0u(hatchAvatarPlaybackState, c3ux);
        this.playback = hatchAvatarPlaybackState;
        this.scope = c3ux;
    }

    @Override // X.Akx
    /* renamed from: onPostFling-RZ2iAVY */
    public /* bridge */ Object mo3onPostFlingRZ2iAVY(long j, long j2, HtJ<? super C1251Afj> htJ) {
        return AnonymousClass006.A0a();
    }

    @Override // X.Akx
    /* renamed from: onPreFling-QWom1Mo */
    public /* bridge */ Object mo5onPreFlingQWom1Mo(long j, HtJ<? super C1251Afj> htJ) {
        return AnonymousClass006.A0a();
    }

    @Override // X.Akx
    /* renamed from: onPostScroll-DzOQY0M */
    public /* bridge */ long mo4onPostScrollDzOQY0M(long j, long j2, int i) {
        return 0L;
    }
}
