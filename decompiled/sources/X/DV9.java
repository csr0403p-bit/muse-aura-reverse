package X;

import android.content.Context;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class DV9 implements DVK {
    public InterfaceC6095Dva A00 = InterfaceC6095Dva.A00;
    public InterfaceC6093DvY A03 = InterfaceC6093DvY.A00;
    public DVE A01 = DVF.A00;
    public InterfaceC6097Dvc A02 = InterfaceC6097Dvc.A00;

    @Override // X.DVK
    public final InterfaceC6035DuU A7Z(Context context, DF1 df1, DVI dvi, DFE dfe, InterfaceC6083DvN interfaceC6083DvN, InterfaceC4887DDb interfaceC4887DDb, DDR ddr, C5092DXa c5092DXa, DVD dvd, BZQ bzq, C5596Dlb c5596Dlb, HeroPlayerSetting heroPlayerSetting, InterfaceC6113Dvs interfaceC6113Dvs, Map map, ScheduledExecutorService scheduledExecutorService, AtomicReference atomicReference) {
        C7384Etj.A0Y(ddr, 0);
        AnonymousClass005.A16(map, heroPlayerSetting, dfe, interfaceC6113Dvs, 2);
        C7384Etj.A0Y(atomicReference, 8);
        C7384Etj.A0Y(interfaceC6083DvN, 12);
        C7384Etj.A0Y(df1, 15);
        return new DV6(context, df1, dvi, dfe, interfaceC6083DvN, interfaceC4887DDb, ddr, c5092DXa, dvd, this.A01, this.A02, this.A00, this.A03, bzq, c5596Dlb, heroPlayerSetting, interfaceC6113Dvs, map, scheduledExecutorService, atomicReference);
    }
}
