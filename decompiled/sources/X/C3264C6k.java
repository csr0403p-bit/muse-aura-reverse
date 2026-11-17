package X;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.aura.common.video.HatchTransportHttpDataSourceKt;
import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;
import com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepositoryJsonKt;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import java.nio.MappedByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.C6k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3264C6k {
    public static AtomicReference<C3264C6k> A03 = BV4.A15();
    public String A00;
    public final C3193C2r A01;
    public final Object A02;

    public C3264C6k(C3193C2r c3193C2r) {
        Object objA0T = C3cG.A0T();
        this.A02 = objA0T;
        this.A01 = c3193C2r;
        if (C7O.A00(null, this, A03)) {
            A01(this, C79.A03, null, null, "", ' ', '0', false, true, false, false, false);
            A05(C68.A0D);
            A03(' ');
            synchronized (this.A02) {
                this.A01.A00.put(205, (byte) 32);
                A00(this);
            }
            synchronized (this.A02) {
                this.A01.A00.put(HatchTransportHttpDataSourceKt.HTTP_PARTIAL_CONTENT, (byte) 48);
                A00(this);
            }
            synchronized (this.A02) {
                MappedByteBuffer mappedByteBuffer = this.A01.A00;
                mappedByteBuffer.put(275, (byte) 48);
                mappedByteBuffer.putLong(276, 0L);
                A02(this, "", 284, 80, false);
                A00(this);
            }
            synchronized (this.A02) {
                MappedByteBuffer mappedByteBuffer2 = this.A01.A00;
                mappedByteBuffer2.putInt(749, -1);
                mappedByteBuffer2.putLong(1753, System.currentTimeMillis());
                mappedByteBuffer2.putLong(1761, SystemClock.uptimeMillis());
                A00(this);
            }
            int i = 0;
            String strSubstring = "unknown".length() > 1000 ? "unknown".substring(0, 1000) : "unknown";
            synchronized (this.A02) {
                MappedByteBuffer mappedByteBuffer3 = this.A01.A00;
                mappedByteBuffer3.putShort(753, (short) 0);
                byte[] bytes = strSubstring.getBytes();
                while (true) {
                    int length = bytes.length;
                    if (i < length) {
                        mappedByteBuffer3.put(i + 755, bytes[i]);
                        i++;
                    } else {
                        mappedByteBuffer3.putShort(753, (short) length);
                        A00(this);
                    }
                }
            }
            Object obj = this.A02;
            synchronized (obj) {
                MappedByteBuffer mappedByteBuffer4 = this.A01.A00;
                mappedByteBuffer4.put(207, (byte) 1);
                mappedByteBuffer4.put(224, (byte) 1);
                mappedByteBuffer4.putLong(208, 0L);
                mappedByteBuffer4.putLong(225, 0L);
                mappedByteBuffer4.putLong(HatchIdeaShareImageRenderer.ILLUSTRATION_SIZE, 0L);
                mappedByteBuffer4.putLong(233, 0L);
                mappedByteBuffer4.put(207, (byte) 0);
                mappedByteBuffer4.put(224, (byte) 0);
            }
            synchronized (obj) {
                A00(this);
            }
            Object obj2 = this.A02;
            synchronized (obj2) {
                MappedByteBuffer mappedByteBuffer5 = this.A01.A00;
                mappedByteBuffer5.put(241, (byte) 1);
                mappedByteBuffer5.put(258, (byte) 1);
                mappedByteBuffer5.putLong(242, 0L);
                mappedByteBuffer5.putLong(259, 0L);
                mappedByteBuffer5.putLong(250, 0L);
                mappedByteBuffer5.putLong(VoiceSelectionRepositoryJsonKt.MAX_VOICE_ID_LENGTH, 0L);
                mappedByteBuffer5.put(241, (byte) 0);
                mappedByteBuffer5.put(258, (byte) 0);
            }
            synchronized (obj2) {
                A00(this);
            }
            synchronized (objA0T) {
                c3193C2r.A00.put(2242, (byte) 0);
            }
            A04(0L);
        }
    }

    public final void A03(char c) {
        synchronized (this.A02) {
            this.A01.A00.put(166, (byte) c);
            A00(this);
        }
    }

    public final void A04(long j) {
        synchronized (this.A02) {
            this.A01.A00.putLong(1769, j);
            A00(this);
        }
    }

    public final void A05(C68 c68) {
        char c = c68.mSymbol;
        if (c < 0 || c > '\u007f') {
            throw C3cG.A0Q("State byte should be ASCII");
        }
        synchronized (this.A02) {
            this.A01.A00.put(0, (byte) c);
            A00(this);
        }
    }

    public static void A00(C3264C6k c3264C6k) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (c3264C6k.A02) {
            A02(c3264C6k, Long.toString(jCurrentTimeMillis), 180, 15, false);
        }
    }

    public static final void A02(C3264C6k c3264C6k, String str, int i, int i2, boolean z) {
        int length;
        int i3 = 0;
        if (str.length() > i2) {
            str = str.substring(0, i2);
        }
        synchronized (c3264C6k.A02) {
            MappedByteBuffer mappedByteBuffer = c3264C6k.A01.A00;
            byte[] bytes = str.getBytes();
            if (z) {
                mappedByteBuffer.putShort(i, (short) 0);
            } else {
                mappedByteBuffer.put(i, (byte) 0);
            }
            while (true) {
                length = bytes.length;
                if (i3 >= length) {
                    break;
                }
                int i4 = 2;
                if (!z) {
                    i4 = 1;
                }
                mappedByteBuffer.put(i4 + i + i3, bytes[i3]);
                i3++;
            }
            if (z) {
                mappedByteBuffer.putShort(i, (short) length);
            } else {
                mappedByteBuffer.put(i, (byte) length);
            }
        }
    }

    public static void A01(C3264C6k c3264C6k, Integer num, Integer num2, Integer num3, String str, char c, char c2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        char cA00 = C74.A00(num);
        if (c >= 0 && c <= '\u007f') {
            synchronized (c3264C6k.A02) {
                MappedByteBuffer mappedByteBuffer = c3264C6k.A01.A00;
                mappedByteBuffer.put(1, (byte) cA00);
                mappedByteBuffer.put(196, (byte) c2);
                mappedByteBuffer.put(2, (byte) c);
                mappedByteBuffer.put(198, (byte) (z ? 49 : 48));
                if (z2 || num.compareTo(C79.A0T) < 0) {
                    mappedByteBuffer.put(202, (byte) 48);
                    mappedByteBuffer.put(200, (byte) 48);
                    mappedByteBuffer.put(2254, (byte) 48);
                }
                byte b = -1;
                if (num2 != null) {
                    int iIntValue = num2.intValue();
                    if (iIntValue > 127) {
                        iIntValue = 127;
                    }
                    mappedByteBuffer.put(203, (byte) iIntValue);
                } else {
                    mappedByteBuffer.put(203, (byte) -1);
                }
                if (num3 != null) {
                    int iIntValue2 = num3.intValue();
                    b = (byte) (iIntValue2 <= 127 ? iIntValue2 : 127);
                }
                mappedByteBuffer.put(HatchWidgetWebViewKt.HTTP_NO_CONTENT, b);
                if (z3) {
                    mappedByteBuffer.put(1985, (byte) (z4 ? 49 : 48));
                    mappedByteBuffer.put(1986, (byte) (z5 ? 49 : 48));
                }
                if (str != null) {
                    A02(c3264C6k, str, 1987, 255, false);
                }
                if (C3266C6p.A02 == null) {
                    synchronized (C3266C6p.class) {
                        if (C3266C6p.A02 == null) {
                            C3266C6p.A02 = new C3266C6p();
                        }
                    }
                }
                C3266C6p c3266C6p = C3266C6p.A02;
                if (c3266C6p != null) {
                    Uri uri = c3266C6p.A00.get();
                    Uri uri2 = c3266C6p.A01.get();
                    String strSubstring = "N/A";
                    String string = uri != null ? uri.toString() : "N/A";
                    if (uri2 != null) {
                        strSubstring = uri2.toString();
                    }
                    if (string.length() > 485) {
                        string = string.substring(0, 485);
                    }
                    if (strSubstring.length() > 485) {
                        strSubstring = strSubstring.substring(0, 485);
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("first", string);
                        jSONObject.put("last", strSubstring);
                    } catch (JSONException unused) {
                    }
                    String string2 = jSONObject.toString();
                    if (!string2.isEmpty() && string2.length() < 1000) {
                        A02(c3264C6k, string2, 2255, 1000, true);
                    }
                }
                A00(c3264C6k);
            }
            return;
        }
        throw new IllegalStateException("State byte should be ASCII");
    }
}
