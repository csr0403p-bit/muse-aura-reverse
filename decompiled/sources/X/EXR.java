package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class EXR extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ EXZ $params;
    public final /* synthetic */ C6729EXn $sessionEvent;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ C6718EXb $sessionStopwatch;
    public final /* synthetic */ String $sessionToken;
    public final /* synthetic */ EXP this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EXR(EXZ exz, EXP exp, C6729EXn c6729EXn, C6718EXb c6718EXb, String str, String str2) {
        super(0);
        this.$sessionId = str;
        this.this$0 = exp;
        this.$sessionEvent = c6729EXn;
        this.$sessionStopwatch = c6718EXb;
        this.$params = exz;
        this.$sessionToken = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Unit invoke() {
        String str = this.$sessionId;
        EXP exp = this.this$0;
        if (str != null) {
            C6725EXj c6725EXj = exp.A02;
            C6729EXn c6729EXnA0y = C6729EXn.A0y(this.$sessionEvent, null, Long.valueOf(this.$sessionStopwatch.A00()), str);
            C8ee c8eeA00 = C6725EXj.A00(c6725EXj);
            if (c8eeA00 != null) {
                Eu1 eu1AcquireEvent = c8eeA00.acquireEvent("client_create_dcpiacsession_success");
                if (eu1AcquireEvent.isSampled()) {
                    Eu1.A00(eu1AcquireEvent);
                    Eu1.A01(eu1AcquireEvent, AbstractC6726EXk.A00(c6729EXnA0y));
                    EVX.A00(eu1AcquireEvent);
                }
            }
            EXP.A04(this.$params, this.this$0, this.$sessionId, this.$sessionToken);
        } else {
            EXP.A03(this.$params, exp, this.$sessionEvent, this.$sessionStopwatch, "IAC: sandbox session response missing session_id");
        }
        return Unit.INSTANCE;
    }
}
