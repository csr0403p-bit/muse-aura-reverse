package com.meta.maps.display;

import com.meta.maps.core.GeoCoordinates;

/* loaded from: classes4.dex */
public interface SelectionController {
    void addSelectionChangedCallback(SelectionChangedCallback selectionChangedCallback);

    void clearSelection();

    SelectedFeature getSelectedFeature();

    void registerSelectableContent(SelectableContent selectableContent);

    void removeSelectionChangedCallback(SelectionChangedCallback selectionChangedCallback);

    void select(FeatureInteractionData featureInteractionData, String str, GeoCoordinates geoCoordinates);

    boolean selectById(String str);

    void toggleSelection(FeatureInteractionData featureInteractionData, String str, GeoCoordinates geoCoordinates);

    void unregisterSelectableContent(SelectableContent selectableContent);
}
