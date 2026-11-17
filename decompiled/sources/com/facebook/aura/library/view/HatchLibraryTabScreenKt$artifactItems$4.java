package com.facebook.aura.library.view;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass037;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C10G;
import X.C1515AkP;
import X.C3U4;
import X.C7384Etj;
import X.C90m;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.library.model.ArtifactFile;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchLibraryTabScreenKt$artifactItems$4 extends AbstractC7559F3s implements G2j<AnonymousClass037, Integer, BFM, Integer, Unit> {
    public final /* synthetic */ int $columns;
    public final /* synthetic */ float $gutterWidth;
    public final /* synthetic */ G0U<ArtifactFile, Unit> $onArtifactClick;
    public final /* synthetic */ Function0<Unit> $onArtifactDeleted;
    public final /* synthetic */ G0U<ArtifactFile, Unit> $onTogglePin;
    public final /* synthetic */ List<List<ArtifactFile>> $rows;
    public final /* synthetic */ boolean $showPinAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchLibraryTabScreenKt$artifactItems$4(List<? extends List<ArtifactFile>> list, float f, int i, G0U<? super ArtifactFile, Unit> g0u, Function0<Unit> function0, G0U<? super ArtifactFile, Unit> g0u2, boolean z) {
        super(4);
        this.$rows = list;
        this.$gutterWidth = f;
        this.$columns = i;
        this.$onArtifactClick = g0u;
        this.$onArtifactDeleted = function0;
        this.$onTogglePin = g0u2;
        this.$showPinAction = z;
    }

    public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
        int iA0E = i2;
        C7384Etj.A0Y(anonymousClass037, 0);
        if ((i2 & 48) == 0) {
            iA0E = i2 | AnonymousClass004.A0E(bfm, i);
        }
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0E & 145, VoiceCallForegroundService.AVATAR_TARGET_PX), bfm, iA0E)) {
            bfm.Afo();
            return;
        }
        List<ArtifactFile> list = this.$rows.get(i);
        BS0 bs0 = BRg.A00;
        BRg bRgA0C = C3U4.A0C(C3U4.A0B(C10G.A02, this.$gutterWidth, 0.0f), 0.0f, i == 0 ? 0.0f : HatchLibraryTabScreenKt.GRID_SPACING / 2.0f, 0.0f, i == this.$rows.size() - 1 ? 0.0f : HatchLibraryTabScreenKt.GRID_SPACING / 2.0f);
        C9m9 c9m9A00 = AcQ.A00(HatchLibraryTabScreenKt.GRID_SPACING);
        int i3 = this.$columns;
        G0U<ArtifactFile, Unit> g0u = this.$onArtifactClick;
        Function0<Unit> function0 = this.$onArtifactDeleted;
        G0U<ArtifactFile, Unit> g0u2 = this.$onTogglePin;
        boolean z = this.$showPinAction;
        InterfaceC1380AiA interfaceC1380AiAA0Q = AnonymousClass006.A0Q(c9m9A00, bfm);
        BBI bbi = (BBI) bfm;
        int iA0J = AnonymousClass003.A0J(bbi);
        AKQ akqA04 = BBI.A04(bbi);
        BRg bRgA01 = AxM.A01(bfm, bRgA0C);
        Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
        if (bbi.A0V == null) {
            C00x.A00();
            throw F60.createAndThrow();
        }
        AnonymousClass005.A0n(bfm, bbi, function02);
        AnonymousClass005.A0p(bfm, interfaceC1380AiAA0Q, akqA04, bRgA01, iA0J);
        C90m c90m = C90m.A00;
        Iterator itA0w = AnonymousClass001.A0w(bfm, list, 1407706889);
        while (itA0w.hasNext()) {
            HatchLibraryTabScreenKt.ArtifactGridCell((ArtifactFile) itA0w.next(), g0u, function0, g0u2, z, AnonymousClass006.A0L(c90m, bs0), bfm, ArtifactFile.$stable, 0);
        }
        BBI.A0R(bbi, false);
        if (list.size() < i3) {
            bfm.AgE(689602898);
            int size = i3 - list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C01N.A07(bfm, AnonymousClass006.A0L(c90m, bs0));
            }
        } else {
            bfm.AgE(689690349);
        }
        AnonymousClass003.A0q(bbi);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
        invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
        return Unit.INSTANCE;
    }
}
