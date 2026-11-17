package com.facebook.aura.file.view;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C31u;
import X.InterfaceC7359EnW;
import com.facebook.aura.file.view.MC;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;

/* loaded from: classes3.dex */
public final class AuraFileViewerLimits {
    public static final int $stable = 0;
    public static final long BYTES_PER_MB = 1048576;
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(AuraFileViewerLimits.class, "maxRenderMb", "getMaxRenderMb()I");
    public static final AuraFileViewerLimits INSTANCE = new AuraFileViewerLimits();
    public static final C31u maxRenderMb$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(MC.hatch_android.file_viewer_max_render_size_mb);

    private final int getMaxRenderMb() {
        return AnonymousClass001.A0F(maxRenderMb$delegate.getValue(this, $$delegatedProperties[0]));
    }

    public final long getMaxRenderBytes() {
        return getMaxRenderMb() * 1048576;
    }
}
