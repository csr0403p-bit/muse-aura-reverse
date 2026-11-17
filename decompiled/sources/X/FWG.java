package X;

/* loaded from: classes6.dex */
public abstract class FWG extends FWH<Hm3> {
    public static final int DISMISS_EVENT_ACTION = 1;
    public static final int DISMISS_EVENT_CONSECUTIVE = 4;
    public static final int DISMISS_EVENT_MANUAL = 3;
    public static final int DISMISS_EVENT_SWIPE = 0;
    public static final int DISMISS_EVENT_TIMEOUT = 2;

    /* renamed from: onDismissed, reason: avoid collision after fix types in other method */
    public abstract void onDismissed2(Hm3 hm3, int i);

    /* renamed from: onShown, reason: avoid collision after fix types in other method */
    public void onShown2(Hm3 hm3) {
    }

    @Override // X.FWH
    public /* bridge */ /* synthetic */ void onDismissed(Hm3 hm3, int i) {
        throw F60.createAndThrow();
    }

    @Override // X.FWH
    public /* bridge */ /* synthetic */ void onShown(Hm3 hm3) {
    }
}
