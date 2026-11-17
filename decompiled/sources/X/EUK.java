package X;

import com.facebook.tigon.tigonobserver.TigonObservable;
import com.facebook.tigon.tigonobserver.TigonObserverData;
import com.facebook.tigon.tigonobserver.interfaces.TigonBodyObservation;

/* loaded from: classes5.dex */
public final class EUK implements Runnable {
    public static final String __redex_internal_original_name = "TigonObservable$TigonObservableRunnable";
    public int A00;
    public TigonObserverData A01;
    public TigonBodyObservation A02;
    public final String A03 = EUK.class.getSimpleName();
    public final /* synthetic */ TigonObservable A04;

    public EUK(TigonObservable tigonObservable) {
        this.A04 = tigonObservable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TigonObservable tigonObservable;
        switch (this.A00) {
            case 0:
                this.A01.getClass();
                tigonObservable = this.A04;
                tigonObservable.callOnAdded(this.A01);
                break;
            case 1:
                this.A01.getClass();
                tigonObservable = this.A04;
                tigonObservable.callOnConnectionAcquisitionStarted(this.A01);
                break;
            case 2:
                this.A01.getClass();
                tigonObservable = this.A04;
                tigonObservable.callOnStarted(this.A01);
                break;
            case 3:
                this.A01.getClass();
                tigonObservable = this.A04;
                tigonObservable.callOnResponse(this.A01);
                break;
            case 4:
                this.A01.getClass();
                tigonObservable = this.A04;
                tigonObservable.callOnEOM(this.A01);
                break;
            case 5:
                this.A01.getClass();
                tigonObservable = this.A04;
                tigonObservable.callOnError(this.A01);
                break;
            case 6:
                this.A01.getClass();
                tigonObservable = this.A04;
                tigonObservable.callOnWillRetry(this.A01);
                break;
            case 7:
                this.A02.getClass();
                tigonObservable = this.A04;
                tigonObservable.callOnUploadBody(this.A02);
                break;
            case 8:
                this.A02.getClass();
                tigonObservable = this.A04;
                tigonObservable.callOnDownloadBody(this.A02);
                break;
            default:
                throw new AssertionError("Unknown ObserverStep");
        }
        tigonObservable.mObjectPool.A02(this);
    }
}
