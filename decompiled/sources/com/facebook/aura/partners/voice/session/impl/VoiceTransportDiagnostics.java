package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC0878AGe;
import X.AnonymousClass003;
import X.C10517Hof;
import X.C10518Hog;
import X.C3cG;
import X.C3cH;
import X.C57l;
import X.C57m;
import X.C7384Etj;
import X.C7BY;
import X.C8j3;
import X.C9659Gcj;
import X.CFK;
import X.Ey9;
import X.F0C;
import X.GQK;
import X.GQW;
import X.GQb;
import X.GRH;
import X.GRK;
import X.InterfaceC05673vm;
import com.facebook.aura.network.state.AuraNetworkMonitor;
import com.facebook.aura.network.state.AuraNetworkState;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;
import com.facebook.rsys.audio.gen.AudioModel;
import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.ended.gen.EndedModel;
import com.facebook.rsys.mediastats.gen.MediaStats;
import com.facebook.rsys.state.gen.State;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class VoiceTransportDiagnostics {
    public static final VoiceTransportDiagnostics INSTANCE = new VoiceTransportDiagnostics();
    public static final String RELAY_CANDIDATE = "relay";
    public static final String RELAY_PROTOCOL_PREFIX = ",rt_";
    public static final String TAG = "VoiceTransportDiagnostics";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public final class Event {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ Event[] $VALUES;
        public static final Event APP_ENDING;
        public static final Event STATE_CHANGED;

        static {
            Event event = new Event("STATE_CHANGED", 0);
            STATE_CHANGED = event;
            Event event2 = new Event("APP_ENDING", 1);
            APP_ENDING = event2;
            Event[] eventArr = {event, event2};
            $VALUES = eventArr;
            $ENTRIES = C3cG.A0w(eventArr);
        }

        public static Ey9<Event> getEntries() {
            return $ENTRIES;
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }

        public Event(String str, int i) {
        }
    }

    private final void logState(C57m c57m, Event event) {
        boolean z;
        int i;
        String str;
        String strName;
        String str2;
        MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession = (MetaAiRsysSdkRealTimeSession) c57m;
        boolean z2 = false;
        GRH grhA00 = C9659Gcj.A00(GRK.A00(metaAiRsysSdkRealTimeSession.A0G));
        InterfaceC05673vm value = c57m.ADx().getValue();
        CallModel callModel = (CallModel) grhA00.A00(CallModel.class);
        Integer numValueOf = callModel != null ? Integer.valueOf(callModel.inCallState) : null;
        boolean z3 = value instanceof C57l;
        if (!(z3 && ((C57l) value).A02) && (event != Event.APP_ENDING || (numValueOf != null && numValueOf.intValue() == 7))) {
            z = false;
            i = 4;
        } else {
            z = true;
            i = 5;
        }
        if (CFK.A02.AOg(i)) {
            AuraNetworkState value2 = AuraNetworkMonitor.state.getValue();
            boolean z4 = value2 instanceof AuraNetworkState.Online;
            AuraNetworkState.Online online = z4 ? (AuraNetworkState.Online) value2 : null;
            List<MediaStats> value3 = metaAiRsysSdkRealTimeSession.A0C.A0B.getValue();
            MediaStats mediaStats = (MediaStats) AbstractC0878AGe.A0G(value3);
            StringBuilder sbA0f = C3cG.A0f(event, "event=");
            sbA0f.append(" sdkState=");
            if (value instanceof C10518Hog) {
                str = "ESTABLISHING";
            } else if (value instanceof GQb) {
                str = "CONNECTED";
            } else if (value instanceof C10517Hof) {
                str = "RECONNECTING";
            } else {
                if (!z3) {
                    throw C3cG.A0q();
                }
                str = "ENDED";
            }
            sbA0f.append(str);
            sbA0f.append(" nativeCallState=");
            State state = (State) grhA00.A00(State.class);
            sbA0f.append(state != null ? Integer.valueOf(state.callState) : null);
            sbA0f.append(" nativeInCallState=");
            sbA0f.append(numValueOf);
            sbA0f.append(" nativeEndReason=");
            EndedModel endedModel = (EndedModel) grhA00.A00(EndedModel.class);
            sbA0f.append(endedModel != null ? Integer.valueOf(endedModel.reason) : null);
            sbA0f.append(" audioBufferingStarted=");
            AudioModel audioModel = (AudioModel) grhA00.A00(AudioModel.class);
            sbA0f.append(audioModel != null ? Boolean.valueOf(audioModel.audioBufferingStarted) : null);
            sbA0f.append(" localPlayoutStarted=");
            sbA0f.append(C3cH.A1R(metaAiRsysSdkRealTimeSession.A0c));
            sbA0f.append(" micEnabled=");
            F0C f0c = metaAiRsysSdkRealTimeSession.A0S;
            sbA0f.append(C3cH.A1R(((GQK) f0c.getValue()).A08));
            sbA0f.append(" botAudioEnabled=");
            sbA0f.append(C3cH.A1R(((GQK) f0c.getValue()).A07));
            sbA0f.append(" osNetwork=");
            String str3 = "UNKNOWN";
            if (C7384Etj.areEqual(value2, AuraNetworkState.Unknown.INSTANCE)) {
                strName = "UNKNOWN";
            } else if (C7384Etj.areEqual(value2, AuraNetworkState.Offline.INSTANCE)) {
                strName = "OFFLINE";
            } else {
                if (!z4) {
                    throw C3cG.A0q();
                }
                strName = ((AuraNetworkState.Online) value2).transport.name();
            }
            sbA0f.append(strName);
            sbA0f.append(" validated=");
            sbA0f.append(online != null ? Boolean.valueOf(online.isValidated) : null);
            sbA0f.append(" metered=");
            sbA0f.append(online != null ? Boolean.valueOf(online.isMetered) : null);
            sbA0f.append(" routeHatch=");
            GQW gqw = metaAiRsysSdkRealTimeSession.A0A;
            sbA0f.append(gqw != null ? false : null);
            sbA0f.append(" routeMetaAi=");
            sbA0f.append(gqw != null ? Boolean.valueOf(gqw.A08) : null);
            sbA0f.append(" originVipId=");
            sbA0f.append(gqw != null ? Integer.valueOf(gqw.A00) : null);
            sbA0f.append(" mediaToCosmos=");
            sbA0f.append(gqw != null ? Boolean.valueOf(gqw.A07) : null);
            sbA0f.append(" mediaStreamCount=");
            sbA0f.append(value3.size());
            sbA0f.append(" protocol=");
            String strProtocol = INSTANCE.protocol(mediaStats != null ? mediaStats.connectionType : null);
            sbA0f.append(strProtocol != null ? strProtocol.toUpperCase(Locale.ROOT) : "UNKNOWN");
            sbA0f.append(" ipVersion=");
            if (mediaStats != null && (str2 = mediaStats.currentIpVersion) != null) {
                int iHashCode = str2.hashCode();
                if (iHashCode != 3710) {
                    if (iHashCode == 3712 && str2.equals("v6")) {
                        str3 = "IPV6";
                    }
                } else if (str2.equals("v4")) {
                    str3 = "IPV4";
                }
            }
            sbA0f.append(str3);
            sbA0f.append(" audioBytesSent=");
            Iterator<MediaStats> it = value3.iterator();
            long jLongValue = 0;
            long jLongValue2 = 0;
            boolean z5 = false;
            while (it.hasNext()) {
                Long l = it.next().audioBytesSent;
                if (l != null) {
                    jLongValue2 += l.longValue();
                    z5 = true;
                }
            }
            sbA0f.append(z5 ? Long.valueOf(jLongValue2) : null);
            sbA0f.append(" audioBytesReceived=");
            Iterator<MediaStats> it2 = value3.iterator();
            long jLongValue3 = 0;
            boolean z6 = false;
            while (it2.hasNext()) {
                Long l2 = it2.next().audioBytesReceived;
                if (l2 != null) {
                    jLongValue3 += l2.longValue();
                    z6 = true;
                }
            }
            sbA0f.append(z6 ? Long.valueOf(jLongValue3) : null);
            sbA0f.append(" audioPacketsReceived=");
            Iterator<MediaStats> it3 = value3.iterator();
            long jLongValue4 = 0;
            boolean z7 = false;
            while (it3.hasNext()) {
                Long l3 = it3.next().audioPacketsReceived;
                if (l3 != null) {
                    jLongValue4 += l3.longValue();
                    z7 = true;
                }
            }
            sbA0f.append(z7 ? Long.valueOf(jLongValue4) : null);
            sbA0f.append(" audioPacketsLost=");
            Iterator<MediaStats> it4 = value3.iterator();
            while (it4.hasNext()) {
                Long l4 = it4.next().audioPacketsLost;
                if (l4 != null) {
                    jLongValue += l4.longValue();
                    z2 = true;
                }
            }
            sbA0f.append(z2 ? Long.valueOf(jLongValue) : null);
            sbA0f.append(" rttMs=");
            sbA0f.append(mediaStats != null ? mediaStats.curRttMs : null);
            sbA0f.append(" stunLatencyMs=");
            String strA14 = C8j3.A14(mediaStats != null ? mediaStats.stunLatencyMs : null, sbA0f);
            if (z) {
                CFK.A06(TAG, strA14);
            } else {
                CFK.A05(TAG, strA14);
            }
        }
    }

    private final String protocol(String str) {
        if (str != null && str.startsWith("l:")) {
            String strA0S = C7BY.A0S(str, str, '(');
            String strA0R = C7BY.A0R(strA0S, strA0S, '-');
            if ("udp".equals(strA0R) || "tcp".equals(strA0R)) {
                return strA0R;
            }
        }
        return null;
    }

    public final String mediaTransport(MediaStats mediaStats) {
        C7384Etj.A0Y(mediaStats, 0);
        String strProtocol = protocol(mediaStats.connectionType);
        if (strProtocol == null) {
            return null;
        }
        if (!RELAY_CANDIDATE.equals(mediaStats.localType)) {
            return strProtocol;
        }
        String str = mediaStats.connectionType;
        if (str == null) {
            str = "";
        }
        String strA0U = C7BY.A0U(str, RELAY_PROTOCOL_PREFIX, "");
        String strA0S = C7BY.A0S(strA0U, strA0U, ',');
        if (strA0S.length() != 0) {
            strProtocol = strA0S;
        }
        return strProtocol.equals("udp") ? "relay_udp" : "relay_tcp";
    }

    public final void log(C57m c57m, Event event) {
        AnonymousClass003.A0u(c57m, event);
        if (CFK.A02.AOg(5)) {
            try {
                logState(c57m, event);
            } catch (Exception unused) {
                CFK.A06(TAG, "Transport diagnostics unavailable");
            }
        }
    }
}
