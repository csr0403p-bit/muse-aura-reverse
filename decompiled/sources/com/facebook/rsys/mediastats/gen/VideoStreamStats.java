package com.facebook.rsys.mediastats.gen;

import X.AbstractC7608F5v;
import X.AbstractC7610F5x;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class VideoStreamStats {
    public static G50<VideoStreamStats> CONVERTER = C8921Ftd.A00(2);
    public static long sMcfTypeId;
    public final Long avSyncAbsMS;
    public final Float bitrateKbps;
    public final Long bytesReceived;
    public final Long bytesSent;
    public final String codec;
    public final Long e2eDelayMS;
    public final Long estimatedPlayoutTimestampMS;
    public final Long fecPacketsReceived;
    public final Integer frameHeight;
    public final Integer frameWidth;
    public final Long framesDecoded;
    public final Float framesDecodedPerSecond;
    public final Long framesEncoded;
    public final Float framesEncodedPerSecond;
    public final Long jitterMS;
    public final Long nackCount;
    public final Long packetsLost;
    public final Long packetsReceived;
    public final String qualityLimitationReason;
    public final Long retransmittedPacketsSent;
    public final String ssrc;
    public final Float targetBitrateKbps;
    public final Float totalEncodeTime;

    public static native VideoStreamStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VideoStreamStats) {
                VideoStreamStats videoStreamStats = (VideoStreamStats) obj;
                String str = this.ssrc;
                String str2 = videoStreamStats.ssrc;
                if (str != null ? str.equals(str2) : str2 == null) {
                    Integer num = this.frameWidth;
                    Integer num2 = videoStreamStats.frameWidth;
                    if (num == null) {
                        if (num2 != null) {
                            return false;
                        }
                    } else if (num.equals(num2)) {
                    }
                    Integer num3 = this.frameHeight;
                    Integer num4 = videoStreamStats.frameHeight;
                    if (num3 == null) {
                        if (num4 != null) {
                            return false;
                        }
                    } else if (num3.equals(num4)) {
                    }
                    Float f = this.bitrateKbps;
                    Float f2 = videoStreamStats.bitrateKbps;
                    if (f == null) {
                        if (f2 != null) {
                            return false;
                        }
                    } else if (f.equals(f2)) {
                    }
                    Long l = this.bytesSent;
                    Long l2 = videoStreamStats.bytesSent;
                    if (l == null) {
                        if (l2 != null) {
                            return false;
                        }
                    } else if (l.equals(l2)) {
                    }
                    Long l3 = this.bytesReceived;
                    Long l4 = videoStreamStats.bytesReceived;
                    if (l3 == null) {
                        if (l4 != null) {
                            return false;
                        }
                    } else if (l3.equals(l4)) {
                    }
                    Long l5 = this.retransmittedPacketsSent;
                    Long l6 = videoStreamStats.retransmittedPacketsSent;
                    if (l5 == null) {
                        if (l6 != null) {
                            return false;
                        }
                    } else if (l5.equals(l6)) {
                    }
                    Long l7 = this.framesEncoded;
                    Long l8 = videoStreamStats.framesEncoded;
                    if (l7 == null) {
                        if (l8 != null) {
                            return false;
                        }
                    } else if (l7.equals(l8)) {
                    }
                    Float f3 = this.framesEncodedPerSecond;
                    Float f4 = videoStreamStats.framesEncodedPerSecond;
                    if (f3 == null) {
                        if (f4 != null) {
                            return false;
                        }
                    } else if (f3.equals(f4)) {
                    }
                    Long l9 = this.framesDecoded;
                    Long l10 = videoStreamStats.framesDecoded;
                    if (l9 == null) {
                        if (l10 != null) {
                            return false;
                        }
                    } else if (l9.equals(l10)) {
                    }
                    Float f5 = this.framesDecodedPerSecond;
                    Float f6 = videoStreamStats.framesDecodedPerSecond;
                    if (f5 == null) {
                        if (f6 != null) {
                            return false;
                        }
                    } else if (f5.equals(f6)) {
                    }
                    String str3 = this.codec;
                    String str4 = videoStreamStats.codec;
                    if (str3 == null) {
                        if (str4 != null) {
                            return false;
                        }
                    } else if (str3.equals(str4)) {
                    }
                    Long l11 = this.e2eDelayMS;
                    Long l12 = videoStreamStats.e2eDelayMS;
                    if (l11 == null) {
                        if (l12 != null) {
                            return false;
                        }
                    } else if (l11.equals(l12)) {
                    }
                    Long l13 = this.nackCount;
                    Long l14 = videoStreamStats.nackCount;
                    if (l13 == null) {
                        if (l14 != null) {
                            return false;
                        }
                    } else if (l13.equals(l14)) {
                    }
                    Long l15 = this.jitterMS;
                    Long l16 = videoStreamStats.jitterMS;
                    if (l15 == null) {
                        if (l16 != null) {
                            return false;
                        }
                    } else if (l15.equals(l16)) {
                    }
                    Long l17 = this.packetsReceived;
                    Long l18 = videoStreamStats.packetsReceived;
                    if (l17 == null) {
                        if (l18 != null) {
                            return false;
                        }
                    } else if (l17.equals(l18)) {
                    }
                    Long l19 = this.packetsLost;
                    Long l20 = videoStreamStats.packetsLost;
                    if (l19 == null) {
                        if (l20 != null) {
                            return false;
                        }
                    } else if (l19.equals(l20)) {
                    }
                    Long l21 = this.fecPacketsReceived;
                    Long l22 = videoStreamStats.fecPacketsReceived;
                    if (l21 == null) {
                        if (l22 != null) {
                            return false;
                        }
                    } else if (l21.equals(l22)) {
                    }
                    Float f7 = this.totalEncodeTime;
                    Float f8 = videoStreamStats.totalEncodeTime;
                    if (f7 == null) {
                        if (f8 != null) {
                            return false;
                        }
                    } else if (f7.equals(f8)) {
                    }
                    Float f9 = this.targetBitrateKbps;
                    Float f10 = videoStreamStats.targetBitrateKbps;
                    if (f9 == null) {
                        if (f10 != null) {
                            return false;
                        }
                    } else if (f9.equals(f10)) {
                    }
                    Long l23 = this.estimatedPlayoutTimestampMS;
                    Long l24 = videoStreamStats.estimatedPlayoutTimestampMS;
                    if (l23 == null) {
                        if (l24 != null) {
                            return false;
                        }
                    } else if (l23.equals(l24)) {
                    }
                    Long l25 = this.avSyncAbsMS;
                    Long l26 = videoStreamStats.avSyncAbsMS;
                    if (l25 == null) {
                        if (l26 != null) {
                            return false;
                        }
                    } else if (l25.equals(l26)) {
                    }
                    String str5 = this.qualityLimitationReason;
                    String str6 = videoStreamStats.qualityLimitationReason;
                    if (str5 == null) {
                        if (str6 != null) {
                            return false;
                        }
                    } else if (str5.equals(str6)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((AbstractC7608F5v.A02(AnonymousClass006.A0G(this.ssrc)) + AnonymousClass006.A0D(this.frameWidth)) * 31) + AnonymousClass006.A0D(this.frameHeight)) * 31) + AnonymousClass006.A0D(this.bitrateKbps)) * 31) + AnonymousClass006.A0D(this.bytesSent)) * 31) + AnonymousClass006.A0D(this.bytesReceived)) * 31) + AnonymousClass006.A0D(this.retransmittedPacketsSent)) * 31) + AnonymousClass006.A0D(this.framesEncoded)) * 31) + AnonymousClass006.A0D(this.framesEncodedPerSecond)) * 31) + AnonymousClass006.A0D(this.framesDecoded)) * 31) + AnonymousClass006.A0D(this.framesDecodedPerSecond)) * 31) + AnonymousClass006.A0G(this.codec)) * 31) + AnonymousClass006.A0D(this.e2eDelayMS)) * 31) + AnonymousClass006.A0D(this.nackCount)) * 31) + AnonymousClass006.A0D(this.jitterMS)) * 31) + AnonymousClass006.A0D(this.packetsReceived)) * 31) + AnonymousClass006.A0D(this.packetsLost)) * 31) + AnonymousClass006.A0D(this.fecPacketsReceived)) * 31) + AnonymousClass006.A0D(this.totalEncodeTime)) * 31) + AnonymousClass006.A0D(this.targetBitrateKbps)) * 31) + AnonymousClass006.A0D(this.estimatedPlayoutTimestampMS)) * 31) + AnonymousClass006.A0D(this.avSyncAbsMS)) * 31) + AnonymousClass005.A0H(this.qualityLimitationReason);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("VideoStreamStats{ssrc=");
        sbA0x.append(this.ssrc);
        sbA0x.append(",frameWidth=");
        sbA0x.append(this.frameWidth);
        sbA0x.append(",frameHeight=");
        sbA0x.append(this.frameHeight);
        sbA0x.append(",bitrateKbps=");
        sbA0x.append(this.bitrateKbps);
        sbA0x.append(",bytesSent=");
        sbA0x.append(this.bytesSent);
        sbA0x.append(",bytesReceived=");
        sbA0x.append(this.bytesReceived);
        sbA0x.append(",retransmittedPacketsSent=");
        sbA0x.append(this.retransmittedPacketsSent);
        sbA0x.append(",framesEncoded=");
        sbA0x.append(this.framesEncoded);
        sbA0x.append(",framesEncodedPerSecond=");
        sbA0x.append(this.framesEncodedPerSecond);
        sbA0x.append(",framesDecoded=");
        sbA0x.append(this.framesDecoded);
        sbA0x.append(",framesDecodedPerSecond=");
        sbA0x.append(this.framesDecodedPerSecond);
        sbA0x.append(",codec=");
        sbA0x.append(this.codec);
        sbA0x.append(",e2eDelayMS=");
        sbA0x.append(this.e2eDelayMS);
        sbA0x.append(",nackCount=");
        sbA0x.append(this.nackCount);
        sbA0x.append(",jitterMS=");
        sbA0x.append(this.jitterMS);
        sbA0x.append(",packetsReceived=");
        sbA0x.append(this.packetsReceived);
        sbA0x.append(",packetsLost=");
        sbA0x.append(this.packetsLost);
        sbA0x.append(",fecPacketsReceived=");
        sbA0x.append(this.fecPacketsReceived);
        sbA0x.append(",totalEncodeTime=");
        sbA0x.append(this.totalEncodeTime);
        sbA0x.append(",targetBitrateKbps=");
        sbA0x.append(this.targetBitrateKbps);
        sbA0x.append(",estimatedPlayoutTimestampMS=");
        sbA0x.append(this.estimatedPlayoutTimestampMS);
        sbA0x.append(",avSyncAbsMS=");
        sbA0x.append(this.avSyncAbsMS);
        sbA0x.append(",qualityLimitationReason=");
        return AbstractC7610F5x.A0w(this.qualityLimitationReason, sbA0x);
    }

    public VideoStreamStats(String str, Integer num, Integer num2, Float f, Long l, Long l2, Long l3, Long l4, Float f2, Long l5, Float f3, String str2, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, Float f4, Float f5, Long l12, Long l13, String str3) {
        this.ssrc = str;
        this.frameWidth = num;
        this.frameHeight = num2;
        this.bitrateKbps = f;
        this.bytesSent = l;
        this.bytesReceived = l2;
        this.retransmittedPacketsSent = l3;
        this.framesEncoded = l4;
        this.framesEncodedPerSecond = f2;
        this.framesDecoded = l5;
        this.framesDecodedPerSecond = f3;
        this.codec = str2;
        this.e2eDelayMS = l6;
        this.nackCount = l7;
        this.jitterMS = l8;
        this.packetsReceived = l9;
        this.packetsLost = l10;
        this.fecPacketsReceived = l11;
        this.totalEncodeTime = f4;
        this.targetBitrateKbps = f5;
        this.estimatedPlayoutTimestampMS = l12;
        this.avSyncAbsMS = l13;
        this.qualityLimitationReason = str3;
    }
}
