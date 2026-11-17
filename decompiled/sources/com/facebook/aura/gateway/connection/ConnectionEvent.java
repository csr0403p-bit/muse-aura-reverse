package com.facebook.aura.gateway.connection;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C8j4;
import com.facebook.aura.network.transport.HatchNoiseHandshakeOutcome;

/* loaded from: classes6.dex */
public interface ConnectionEvent {

    public final class ConnectRequested extends C06G implements ConnectionEvent {
        public final boolean force;
        public final boolean joinInFlight;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ConnectRequested) {
                    ConnectRequested connectRequested = (ConnectRequested) obj;
                    if (this.force != connectRequested.force || this.joinInFlight != connectRequested.joinInFlight) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ConnectRequested copy$default(ConnectRequested connectRequested, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = connectRequested.force;
            }
            if ((i & 2) != 0) {
                z2 = connectRequested.joinInFlight;
            }
            return new ConnectRequested(z, z2);
        }

        public final boolean component1() {
            return this.force;
        }

        public final boolean component2() {
            return this.joinInFlight;
        }

        public final ConnectRequested copy(boolean z, boolean z2) {
            return new ConnectRequested(z, z2);
        }

        public final boolean getForce() {
            return this.force;
        }

        public final boolean getJoinInFlight() {
            return this.joinInFlight;
        }

        public int hashCode() {
            return C0KA.A00(C0KA.A02(this.force), this.joinInFlight);
        }

        public ConnectRequested(boolean z, boolean z2) {
            this.force = z;
            this.joinInFlight = z2;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ ConnectRequested(boolean z, boolean z2, int i, C06H c06h) {
            this(z, AnonymousClass001.A1Q(i, z2));
        }
    }

    public final class DisconnectRequested implements ConnectionEvent {
        public static final DisconnectRequested INSTANCE = new DisconnectRequested();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DisconnectRequested);
        }

        public String toString() {
            return "DisconnectRequested";
        }

        public int hashCode() {
            return 1080827722;
        }
    }

    public interface Epoched extends ConnectionEvent {
        long getEpoch();
    }

    public final class ExhaustionCooldownElapsed implements ConnectionEvent {
        public static final ExhaustionCooldownElapsed INSTANCE = new ExhaustionCooldownElapsed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ExhaustionCooldownElapsed);
        }

        public String toString() {
            return "ExhaustionCooldownElapsed";
        }

        public int hashCode() {
            return 1795002411;
        }
    }

    public final class HandshakeStalled extends C06G implements Epoched {
        public final long epoch;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof HandshakeStalled) && this.epoch == ((HandshakeStalled) obj).epoch);
        }

        public static /* synthetic */ HandshakeStalled copy$default(HandshakeStalled handshakeStalled, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = handshakeStalled.epoch;
            }
            return new HandshakeStalled(j);
        }

        public final long component1() {
            return this.epoch;
        }

        public final HandshakeStalled copy(long j) {
            return new HandshakeStalled(j);
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEvent.Epoched
        public long getEpoch() {
            return this.epoch;
        }

        public int hashCode() {
            return AnonymousClass002.A0A(this.epoch);
        }

        public HandshakeStalled(long j) {
            this.epoch = j;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class KeepaliveTick extends C06G implements Epoched {
        public final long epoch;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof KeepaliveTick) && this.epoch == ((KeepaliveTick) obj).epoch);
        }

        public static /* synthetic */ KeepaliveTick copy$default(KeepaliveTick keepaliveTick, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = keepaliveTick.epoch;
            }
            return new KeepaliveTick(j);
        }

        public final long component1() {
            return this.epoch;
        }

        public final KeepaliveTick copy(long j) {
            return new KeepaliveTick(j);
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEvent.Epoched
        public long getEpoch() {
            return this.epoch;
        }

        public int hashCode() {
            return AnonymousClass002.A0A(this.epoch);
        }

        public KeepaliveTick(long j) {
            this.epoch = j;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class KeepaliveTimedOut extends C06G implements Epoched {
        public final long epoch;
        public final boolean latePong;
        public final Presence presence;
        public final long waitMs;

        public KeepaliveTimedOut(long j, boolean z, Presence presence, long j2) {
            C7384Etj.A0Y(presence, 2);
            this.epoch = j;
            this.latePong = z;
            this.presence = presence;
            this.waitMs = j2;
        }

        public static /* synthetic */ KeepaliveTimedOut copy$default(KeepaliveTimedOut keepaliveTimedOut, long j, boolean z, Presence presence, long j2, int i, Object obj) {
            long j3 = j;
            boolean z2 = z;
            Presence presence2 = presence;
            long j4 = j2;
            if ((i & 1) != 0) {
                j3 = keepaliveTimedOut.epoch;
            }
            if ((i & 2) != 0) {
                z2 = keepaliveTimedOut.latePong;
            }
            if ((i & 4) != 0) {
                presence2 = keepaliveTimedOut.presence;
            }
            if ((i & 8) != 0) {
                j4 = keepaliveTimedOut.waitMs;
            }
            C7384Etj.A0Y(presence2, 2);
            return new KeepaliveTimedOut(j3, z2, presence2, j4);
        }

        public final KeepaliveTimedOut copy(long j, boolean z, Presence presence, long j2) {
            C7384Etj.A0Y(presence, 2);
            return new KeepaliveTimedOut(j, z, presence, j2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof KeepaliveTimedOut) {
                    KeepaliveTimedOut keepaliveTimedOut = (KeepaliveTimedOut) obj;
                    if (this.epoch != keepaliveTimedOut.epoch || this.latePong != keepaliveTimedOut.latePong || this.presence != keepaliveTimedOut.presence || this.waitMs != keepaliveTimedOut.waitMs) {
                    }
                }
                return false;
            }
            return true;
        }

        public final long component1() {
            return this.epoch;
        }

        public final boolean component2() {
            return this.latePong;
        }

        public final Presence component3() {
            return this.presence;
        }

        public final long component4() {
            return this.waitMs;
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEvent.Epoched
        public long getEpoch() {
            return this.epoch;
        }

        public final boolean getLatePong() {
            return this.latePong;
        }

        public final Presence getPresence() {
            return this.presence;
        }

        public final long getWaitMs() {
            return this.waitMs;
        }

        public int hashCode() {
            return C8j4.A0B(this.waitMs, AnonymousClass005.A0F(this.presence, C0KA.A01(AnonymousClass005.A07(this.epoch), this.latePong)));
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class LifecycleChanged extends C06G implements ConnectionEvent {
        public final ConnectionLifecycleSnapshot snapshot;

        public LifecycleChanged(ConnectionLifecycleSnapshot connectionLifecycleSnapshot) {
            C7384Etj.A0Y(connectionLifecycleSnapshot, 0);
            this.snapshot = connectionLifecycleSnapshot;
        }

        public final LifecycleChanged copy(ConnectionLifecycleSnapshot connectionLifecycleSnapshot) {
            C7384Etj.A0Y(connectionLifecycleSnapshot, 0);
            return new LifecycleChanged(connectionLifecycleSnapshot);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof LifecycleChanged) && C7384Etj.areEqual(this.snapshot, ((LifecycleChanged) obj).snapshot));
        }

        public static /* synthetic */ LifecycleChanged copy$default(LifecycleChanged lifecycleChanged, ConnectionLifecycleSnapshot connectionLifecycleSnapshot, int i, Object obj) {
            if ((i & 1) != 0) {
                connectionLifecycleSnapshot = lifecycleChanged.snapshot;
            }
            C7384Etj.A0Y(connectionLifecycleSnapshot, 0);
            return new LifecycleChanged(connectionLifecycleSnapshot);
        }

        public final ConnectionLifecycleSnapshot component1() {
            return this.snapshot;
        }

        public final ConnectionLifecycleSnapshot getSnapshot() {
            return this.snapshot;
        }

        public int hashCode() {
            return this.snapshot.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class NetworkChanged extends C06G implements ConnectionEvent {
        public final boolean online;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof NetworkChanged) && this.online == ((NetworkChanged) obj).online);
        }

        public static /* synthetic */ NetworkChanged copy$default(NetworkChanged networkChanged, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = networkChanged.online;
            }
            return new NetworkChanged(z);
        }

        public final boolean component1() {
            return this.online;
        }

        public final NetworkChanged copy(boolean z) {
            return new NetworkChanged(z);
        }

        public final boolean getOnline() {
            return this.online;
        }

        public int hashCode() {
            return this.online ? 1231 : 1237;
        }

        public NetworkChanged(boolean z) {
            this.online = z;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class NetworkRecovered implements ConnectionEvent {
        public static final NetworkRecovered INSTANCE = new NetworkRecovered();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NetworkRecovered);
        }

        public String toString() {
            return "NetworkRecovered";
        }

        public int hashCode() {
            return 1510101085;
        }
    }

    public final class PauseDetected extends C06G implements Epoched {
        public final long epoch;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof PauseDetected) && this.epoch == ((PauseDetected) obj).epoch);
        }

        public static /* synthetic */ PauseDetected copy$default(PauseDetected pauseDetected, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = pauseDetected.epoch;
            }
            return new PauseDetected(j);
        }

        public final long component1() {
            return this.epoch;
        }

        public final PauseDetected copy(long j) {
            return new PauseDetected(j);
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEvent.Epoched
        public long getEpoch() {
            return this.epoch;
        }

        public int hashCode() {
            return AnonymousClass002.A0A(this.epoch);
        }

        public PauseDetected(long j) {
            this.epoch = j;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class PauseRequested implements ConnectionEvent {
        public static final PauseRequested INSTANCE = new PauseRequested();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PauseRequested);
        }

        public String toString() {
            return "PauseRequested";
        }

        public int hashCode() {
            return -821836288;
        }
    }

    public final class ReconnectTimerFired extends C06G implements Epoched {
        public final long epoch;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ReconnectTimerFired) && this.epoch == ((ReconnectTimerFired) obj).epoch);
        }

        public static /* synthetic */ ReconnectTimerFired copy$default(ReconnectTimerFired reconnectTimerFired, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = reconnectTimerFired.epoch;
            }
            return new ReconnectTimerFired(j);
        }

        public final long component1() {
            return this.epoch;
        }

        public final ReconnectTimerFired copy(long j) {
            return new ReconnectTimerFired(j);
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEvent.Epoched
        public long getEpoch() {
            return this.epoch;
        }

        public int hashCode() {
            return AnonymousClass002.A0A(this.epoch);
        }

        public ReconnectTimerFired(long j) {
            this.epoch = j;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class ResetFinished extends C06G implements ConnectionEvent {
        public final boolean success;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ResetFinished) && this.success == ((ResetFinished) obj).success);
        }

        public static /* synthetic */ ResetFinished copy$default(ResetFinished resetFinished, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = resetFinished.success;
            }
            return new ResetFinished(z);
        }

        public final boolean component1() {
            return this.success;
        }

        public final ResetFinished copy(boolean z) {
            return new ResetFinished(z);
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return this.success ? 1231 : 1237;
        }

        public ResetFinished(boolean z) {
            this.success = z;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class ResetRequested implements ConnectionEvent {
        public static final ResetRequested INSTANCE = new ResetRequested();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ResetRequested);
        }

        public String toString() {
            return "ResetRequested";
        }

        public int hashCode() {
            return 1765016263;
        }
    }

    public final class ServiceNoticeReceived extends C06G implements ConnectionEvent {
        public final int code;
        public final String message;

        public ServiceNoticeReceived(int i, String str) {
            C7384Etj.A0Y(str, 1);
            this.code = i;
            this.message = str;
        }

        public final ServiceNoticeReceived copy(int i, String str) {
            C7384Etj.A0Y(str, 1);
            return new ServiceNoticeReceived(i, str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ServiceNoticeReceived) {
                    ServiceNoticeReceived serviceNoticeReceived = (ServiceNoticeReceived) obj;
                    if (this.code != serviceNoticeReceived.code || !C7384Etj.areEqual(this.message, serviceNoticeReceived.message)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ServiceNoticeReceived copy$default(ServiceNoticeReceived serviceNoticeReceived, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = serviceNoticeReceived.code;
            }
            if ((i2 & 2) != 0) {
                str = serviceNoticeReceived.message;
            }
            C7384Etj.A0Y(str, 1);
            return new ServiceNoticeReceived(i, str);
        }

        public final int component1() {
            return this.code;
        }

        public final String component2() {
            return this.message;
        }

        public final int getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.message, this.code * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class StabilityElapsed extends C06G implements Epoched {
        public final long epoch;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof StabilityElapsed) && this.epoch == ((StabilityElapsed) obj).epoch);
        }

        public static /* synthetic */ StabilityElapsed copy$default(StabilityElapsed stabilityElapsed, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = stabilityElapsed.epoch;
            }
            return new StabilityElapsed(j);
        }

        public final long component1() {
            return this.epoch;
        }

        public final StabilityElapsed copy(long j) {
            return new StabilityElapsed(j);
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEvent.Epoched
        public long getEpoch() {
            return this.epoch;
        }

        public int hashCode() {
            return AnonymousClass002.A0A(this.epoch);
        }

        public StabilityElapsed(long j) {
            this.epoch = j;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class StorageRecoveryConnected implements ConnectionEvent {
        public static final StorageRecoveryConnected INSTANCE = new StorageRecoveryConnected();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof StorageRecoveryConnected);
        }

        public String toString() {
            return "StorageRecoveryConnected";
        }

        public int hashCode() {
            return 1077627809;
        }
    }

    public final class SubscribeAckStalled extends C06G implements Epoched {
        public final long epoch;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof SubscribeAckStalled) && this.epoch == ((SubscribeAckStalled) obj).epoch);
        }

        public static /* synthetic */ SubscribeAckStalled copy$default(SubscribeAckStalled subscribeAckStalled, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = subscribeAckStalled.epoch;
            }
            return new SubscribeAckStalled(j);
        }

        public final long component1() {
            return this.epoch;
        }

        public final SubscribeAckStalled copy(long j) {
            return new SubscribeAckStalled(j);
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEvent.Epoched
        public long getEpoch() {
            return this.epoch;
        }

        public int hashCode() {
            return AnonymousClass002.A0A(this.epoch);
        }

        public SubscribeAckStalled(long j) {
            this.epoch = j;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class SuspectedDeadConnection extends C06G implements ConnectionEvent {
        public final String reason;

        public SuspectedDeadConnection(String str) {
            C7384Etj.A0Y(str, 0);
            this.reason = str;
        }

        public final SuspectedDeadConnection copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new SuspectedDeadConnection(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof SuspectedDeadConnection) && C7384Etj.areEqual(this.reason, ((SuspectedDeadConnection) obj).reason));
        }

        public static /* synthetic */ SuspectedDeadConnection copy$default(SuspectedDeadConnection suspectedDeadConnection, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = suspectedDeadConnection.reason;
            }
            C7384Etj.A0Y(str, 0);
            return new SuspectedDeadConnection(str);
        }

        public final String component1() {
            return this.reason;
        }

        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class TransportClosed extends C06G implements Epoched {
        public final int code;
        public final long epoch;
        public final String reason;

        public TransportClosed(long j, int i, String str) {
            C7384Etj.A0Y(str, 2);
            this.epoch = j;
            this.code = i;
            this.reason = str;
        }

        public final TransportClosed copy(long j, int i, String str) {
            C7384Etj.A0Y(str, 2);
            return new TransportClosed(j, i, str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof TransportClosed) {
                    TransportClosed transportClosed = (TransportClosed) obj;
                    if (this.epoch != transportClosed.epoch || this.code != transportClosed.code || !C7384Etj.areEqual(this.reason, transportClosed.reason)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ TransportClosed copy$default(TransportClosed transportClosed, long j, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j = transportClosed.epoch;
            }
            if ((i2 & 2) != 0) {
                i = transportClosed.code;
            }
            if ((i2 & 4) != 0) {
                str = transportClosed.reason;
            }
            return transportClosed.copy(j, i, str);
        }

        public final long component1() {
            return this.epoch;
        }

        public final int component2() {
            return this.code;
        }

        public final String component3() {
            return this.reason;
        }

        public final int getCode() {
            return this.code;
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEvent.Epoched
        public long getEpoch() {
            return this.epoch;
        }

        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.reason, (C3cI.A01(this.epoch) + this.code) * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class TransportConnecting extends C06G implements Epoched {
        public final long epoch;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof TransportConnecting) && this.epoch == ((TransportConnecting) obj).epoch);
        }

        public static /* synthetic */ TransportConnecting copy$default(TransportConnecting transportConnecting, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = transportConnecting.epoch;
            }
            return new TransportConnecting(j);
        }

        public final long component1() {
            return this.epoch;
        }

        public final TransportConnecting copy(long j) {
            return new TransportConnecting(j);
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEvent.Epoched
        public long getEpoch() {
            return this.epoch;
        }

        public int hashCode() {
            return AnonymousClass002.A0A(this.epoch);
        }

        public TransportConnecting(long j) {
            this.epoch = j;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class TransportFailed extends C06G implements Epoched {
        public final long epoch;
        public final Integer httpCode;
        public final String message;
        public final HatchNoiseHandshakeOutcome noiseHandshakeOutcome;

        public static /* synthetic */ TransportFailed copy$default(TransportFailed transportFailed, long j, String str, Integer num, HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome, int i, Object obj) {
            long j2 = j;
            String str2 = str;
            Integer num2 = num;
            HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome2 = hatchNoiseHandshakeOutcome;
            if ((i & 1) != 0) {
                j2 = transportFailed.epoch;
            }
            if ((i & 2) != 0) {
                str2 = transportFailed.message;
            }
            if ((i & 4) != 0) {
                num2 = transportFailed.httpCode;
            }
            if ((i & 8) != 0) {
                hatchNoiseHandshakeOutcome2 = transportFailed.noiseHandshakeOutcome;
            }
            return new TransportFailed(j2, str2, num2, hatchNoiseHandshakeOutcome2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof TransportFailed) {
                    TransportFailed transportFailed = (TransportFailed) obj;
                    if (this.epoch != transportFailed.epoch || !C7384Etj.areEqual(this.message, transportFailed.message) || !C7384Etj.areEqual(this.httpCode, transportFailed.httpCode) || this.noiseHandshakeOutcome != transportFailed.noiseHandshakeOutcome) {
                    }
                }
                return false;
            }
            return true;
        }

        public final long component1() {
            return this.epoch;
        }

        public final String component2() {
            return this.message;
        }

        public final Integer component3() {
            return this.httpCode;
        }

        public final HatchNoiseHandshakeOutcome component4() {
            return this.noiseHandshakeOutcome;
        }

        public final TransportFailed copy(long j, String str, Integer num, HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome) {
            return new TransportFailed(j, str, num, hatchNoiseHandshakeOutcome);
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEvent.Epoched
        public long getEpoch() {
            return this.epoch;
        }

        public final Integer getHttpCode() {
            return this.httpCode;
        }

        public final String getMessage() {
            return this.message;
        }

        public final HatchNoiseHandshakeOutcome getNoiseHandshakeOutcome() {
            return this.noiseHandshakeOutcome;
        }

        public int hashCode() {
            return ((((C3cI.A01(this.epoch) + AnonymousClass006.A0G(this.message)) * 31) + AnonymousClass006.A0D(this.httpCode)) * 31) + C3cH.A02(this.noiseHandshakeOutcome);
        }

        public TransportFailed(long j, String str, Integer num, HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome) {
            this.epoch = j;
            this.message = str;
            this.httpCode = num;
            this.noiseHandshakeOutcome = hatchNoiseHandshakeOutcome;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ TransportFailed(long j, String str, Integer num, HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome, int i, C06H c06h) {
            this(j, str, num, (i & 8) != 0 ? null : hatchNoiseHandshakeOutcome);
        }
    }

    public final class TransportOpened extends C06G implements Epoched {
        public final String connectionId;
        public final long epoch;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof TransportOpened) {
                    TransportOpened transportOpened = (TransportOpened) obj;
                    if (this.epoch != transportOpened.epoch || !C7384Etj.areEqual(this.connectionId, transportOpened.connectionId)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ TransportOpened copy$default(TransportOpened transportOpened, long j, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                j = transportOpened.epoch;
            }
            if ((i & 2) != 0) {
                str = transportOpened.connectionId;
            }
            return new TransportOpened(j, str);
        }

        public final long component1() {
            return this.epoch;
        }

        public final String component2() {
            return this.connectionId;
        }

        public final TransportOpened copy(long j, String str) {
            return new TransportOpened(j, str);
        }

        public final String getConnectionId() {
            return this.connectionId;
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEvent.Epoched
        public long getEpoch() {
            return this.epoch;
        }

        public int hashCode() {
            return C3cI.A01(this.epoch) + AnonymousClass006.A0G(this.connectionId);
        }

        public TransportOpened(long j, String str) {
            this.epoch = j;
            this.connectionId = str;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class TransportSubscribing extends C06G implements Epoched {
        public final long epoch;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof TransportSubscribing) && this.epoch == ((TransportSubscribing) obj).epoch);
        }

        public static /* synthetic */ TransportSubscribing copy$default(TransportSubscribing transportSubscribing, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = transportSubscribing.epoch;
            }
            return new TransportSubscribing(j);
        }

        public final long component1() {
            return this.epoch;
        }

        public final TransportSubscribing copy(long j) {
            return new TransportSubscribing(j);
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEvent.Epoched
        public long getEpoch() {
            return this.epoch;
        }

        public int hashCode() {
            return AnonymousClass002.A0A(this.epoch);
        }

        public TransportSubscribing(long j) {
            this.epoch = j;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class UrlUnavailable extends C06G implements Epoched {
        public final long epoch;
        public final String errorMessage;
        public final String errorType;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof UrlUnavailable) {
                    UrlUnavailable urlUnavailable = (UrlUnavailable) obj;
                    if (this.epoch != urlUnavailable.epoch || !C7384Etj.areEqual(this.errorType, urlUnavailable.errorType) || !C7384Etj.areEqual(this.errorMessage, urlUnavailable.errorMessage)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ UrlUnavailable copy$default(UrlUnavailable urlUnavailable, long j, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = urlUnavailable.epoch;
            }
            if ((i & 2) != 0) {
                str = urlUnavailable.errorType;
            }
            if ((i & 4) != 0) {
                str2 = urlUnavailable.errorMessage;
            }
            return urlUnavailable.copy(j, str, str2);
        }

        public final long component1() {
            return this.epoch;
        }

        public final String component2() {
            return this.errorType;
        }

        public final String component3() {
            return this.errorMessage;
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEvent.Epoched
        public long getEpoch() {
            return this.epoch;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final String getErrorType() {
            return this.errorType;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.errorMessage, AnonymousClass005.A0I(this.errorType, C3cI.A01(this.epoch)));
        }

        public UrlUnavailable(long j, String str, String str2) {
            AnonymousClass003.A0x(str, str2);
            this.epoch = j;
            this.errorType = str;
            this.errorMessage = str2;
        }

        public final UrlUnavailable copy(long j, String str, String str2) {
            AnonymousClass003.A0x(str, str2);
            return new UrlUnavailable(j, str, str2);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class VmStateResolved extends C06G implements Epoched {
        public final long epoch;
        public final boolean isStarting;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof VmStateResolved) {
                    VmStateResolved vmStateResolved = (VmStateResolved) obj;
                    if (this.epoch != vmStateResolved.epoch || this.isStarting != vmStateResolved.isStarting) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ VmStateResolved copy$default(VmStateResolved vmStateResolved, long j, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                j = vmStateResolved.epoch;
            }
            if ((i & 2) != 0) {
                z = vmStateResolved.isStarting;
            }
            return new VmStateResolved(j, z);
        }

        public final long component1() {
            return this.epoch;
        }

        public final boolean component2() {
            return this.isStarting;
        }

        public final VmStateResolved copy(long j, boolean z) {
            return new VmStateResolved(j, z);
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEvent.Epoched
        public long getEpoch() {
            return this.epoch;
        }

        public int hashCode() {
            return C0KA.A00(C3cI.A01(this.epoch), this.isStarting);
        }

        public final boolean isStarting() {
            return this.isStarting;
        }

        public VmStateResolved(long j, boolean z) {
            this.epoch = j;
            this.isStarting = z;
        }

        public String toString() {
            return super.toString();
        }
    }
}
