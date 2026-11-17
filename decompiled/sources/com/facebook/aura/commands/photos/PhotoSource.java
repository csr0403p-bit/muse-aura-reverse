package com.facebook.aura.commands.photos;

import X.AbstractC06907md;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C0881AGi;
import X.C3cG;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.commands.sms.DeviceSmsReaderKt;
import com.facebook.aura.pairs.ConnectionsReceivedItemKt;
import com.facebook.aura.settings.HatchDataExportLoggingKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PhotoSource {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PhotoSource[] $VALUES;
    public static final Companion Companion;
    public static final PhotoSource OTHER;
    public static final PhotoSource RECEIVED;
    public final List<String> relativePathPrefixes;
    public final String wireValue;
    public static final PhotoSource CAMERA = new PhotoSource("CAMERA", 0, "camera", Collections.singletonList("DCIM/Camera/"));
    public static final PhotoSource SCREENSHOT = new PhotoSource("SCREENSHOT", 1, "screenshot", C60O.A16("Pictures/Screenshots/", "DCIM/Screenshots/"));
    public static final PhotoSource DOWNLOAD = new PhotoSource("DOWNLOAD", 2, HatchDataExportLoggingKt.PHASE_DOWNLOAD, C60O.A16("Download/", "Downloads/"));

    public final class Companion {
        public final PhotoSource fromWire(String str) {
            PhotoSource next;
            C7384Etj.A0Y(str, 0);
            Iterator<PhotoSource> it = PhotoSource.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C3cJ.A0J(str).equals(next.getWireValue())) {
                    break;
                }
            }
            return next;
        }

        public final PhotoSource fromRelativePath(String str) {
            PhotoSource next;
            if (str == null) {
                str = "";
            }
            Iterator<PhotoSource> it = PhotoSource.getEntries().iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                List<String> relativePathPrefixes = next.getRelativePathPrefixes();
                if (!(relativePathPrefixes instanceof Collection) || !relativePathPrefixes.isEmpty()) {
                    Iterator<String> it2 = relativePathPrefixes.iterator();
                    while (it2.hasNext()) {
                        String strA0j = AnonymousClass005.A0j(it2);
                        C7384Etj.A0Y(strA0j, 1);
                        if (AnonymousClass006.A1b(strA0j, str)) {
                            break loop0;
                        }
                    }
                }
            }
            PhotoSource photoSource = next;
            return photoSource == null ? PhotoSource.OTHER : photoSource;
        }

        public final String getSelectableWireValues() {
            Ey9<PhotoSource> entries = PhotoSource.getEntries();
            ArrayList arrayListA0h = C3cG.A0h();
            for (PhotoSource photoSource : entries) {
                if (!photoSource.getRelativePathPrefixes().isEmpty()) {
                    arrayListA0h.add(photoSource);
                }
            }
            return AbstractC06907md.A01(", ", arrayListA0h, PhotoSource$Companion$selectableWireValues$2.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        PhotoSource photoSource = new PhotoSource("RECEIVED", 3, ConnectionsReceivedItemKt.DIRECTION_RECEIVED, Arrays.asList("Android/media/com.whatsapp/", "Pictures/WhatsApp/", "Pictures/Messenger/", "Pictures/Messages/", "Pictures/Telegram/", "Android/media/org.telegram.messenger/", "Pictures/Signal/"));
        RECEIVED = photoSource;
        PhotoSource photoSource2 = new PhotoSource("OTHER", 4, DeviceSmsReaderKt.ATTACHMENT_OTHER, C0881AGi.A00);
        OTHER = photoSource2;
        PhotoSource[] photoSourceArr = {CAMERA, SCREENSHOT, DOWNLOAD, photoSource, photoSource2};
        $VALUES = photoSourceArr;
        $ENTRIES = C3cG.A0w(photoSourceArr);
        Companion = new Companion();
    }

    public static Ey9<PhotoSource> getEntries() {
        return $ENTRIES;
    }

    public static PhotoSource valueOf(String str) {
        return (PhotoSource) Enum.valueOf(PhotoSource.class, str);
    }

    public static PhotoSource[] values() {
        return (PhotoSource[]) $VALUES.clone();
    }

    public final List<String> getRelativePathPrefixes() {
        return this.relativePathPrefixes;
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public PhotoSource(String str, int i, String str2, List list) {
        this.wireValue = str2;
        this.relativePathPrefixes = list;
    }
}
