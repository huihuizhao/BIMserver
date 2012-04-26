/**
 * Copyright (C) 2011  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.ifc2x3tc1.impl;

import org.bimserver.emf.IdEObjectImpl;

import org.bimserver.models.ifc2x3tc1.IfcReinforcementBarProperties;
import org.bimserver.models.ifc2x3tc1.IfcReinforcingBarSurfaceEnum;
import org.bimserver.models.ifc2x3tc1.LogPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Reinforcement Bar Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcReinforcementBarPropertiesImpl#getTotalCrossSectionArea <em>Total Cross Section Area</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcReinforcementBarPropertiesImpl#getTotalCrossSectionAreaAsString <em>Total Cross Section Area As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcReinforcementBarPropertiesImpl#getSteelGrade <em>Steel Grade</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcReinforcementBarPropertiesImpl#getBarSurface <em>Bar Surface</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcReinforcementBarPropertiesImpl#getEffectiveDepth <em>Effective Depth</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcReinforcementBarPropertiesImpl#getEffectiveDepthAsString <em>Effective Depth As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcReinforcementBarPropertiesImpl#getNominalBarDiameter <em>Nominal Bar Diameter</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcReinforcementBarPropertiesImpl#getNominalBarDiameterAsString <em>Nominal Bar Diameter As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcReinforcementBarPropertiesImpl#getBarCount <em>Bar Count</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcReinforcementBarPropertiesImpl#getBarCountAsString <em>Bar Count As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcReinforcementBarPropertiesImpl extends IdEObjectImpl implements IfcReinforcementBarProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcReinforcementBarPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotalCrossSectionArea() {
		return (Double) eGet(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__TOTAL_CROSS_SECTION_AREA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCrossSectionArea(double newTotalCrossSectionArea) {
		eSet(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__TOTAL_CROSS_SECTION_AREA, newTotalCrossSectionArea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTotalCrossSectionAreaAsString() {
		return (String) eGet(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__TOTAL_CROSS_SECTION_AREA_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCrossSectionAreaAsString(String newTotalCrossSectionAreaAsString) {
		eSet(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__TOTAL_CROSS_SECTION_AREA_AS_STRING, newTotalCrossSectionAreaAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSteelGrade() {
		return (String) eGet(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__STEEL_GRADE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSteelGrade(String newSteelGrade) {
		eSet(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__STEEL_GRADE, newSteelGrade);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReinforcingBarSurfaceEnum getBarSurface() {
		return (IfcReinforcingBarSurfaceEnum) eGet(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_SURFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBarSurface(IfcReinforcingBarSurfaceEnum newBarSurface) {
		eSet(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_SURFACE, newBarSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBarSurface() {
		eUnset(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_SURFACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBarSurface() {
		return eIsSet(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_SURFACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEffectiveDepth() {
		return (Double) eGet(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__EFFECTIVE_DEPTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveDepth(double newEffectiveDepth) {
		eSet(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__EFFECTIVE_DEPTH, newEffectiveDepth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffectiveDepth() {
		eUnset(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__EFFECTIVE_DEPTH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffectiveDepth() {
		return eIsSet(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__EFFECTIVE_DEPTH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEffectiveDepthAsString() {
		return (String) eGet(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__EFFECTIVE_DEPTH_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveDepthAsString(String newEffectiveDepthAsString) {
		eSet(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__EFFECTIVE_DEPTH_AS_STRING, newEffectiveDepthAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffectiveDepthAsString() {
		eUnset(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__EFFECTIVE_DEPTH_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffectiveDepthAsString() {
		return eIsSet(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__EFFECTIVE_DEPTH_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNominalBarDiameter() {
		return (Double) eGet(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__NOMINAL_BAR_DIAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalBarDiameter(double newNominalBarDiameter) {
		eSet(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__NOMINAL_BAR_DIAMETER, newNominalBarDiameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNominalBarDiameter() {
		eUnset(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__NOMINAL_BAR_DIAMETER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNominalBarDiameter() {
		return eIsSet(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__NOMINAL_BAR_DIAMETER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNominalBarDiameterAsString() {
		return (String) eGet(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__NOMINAL_BAR_DIAMETER_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalBarDiameterAsString(String newNominalBarDiameterAsString) {
		eSet(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__NOMINAL_BAR_DIAMETER_AS_STRING, newNominalBarDiameterAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNominalBarDiameterAsString() {
		eUnset(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__NOMINAL_BAR_DIAMETER_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNominalBarDiameterAsString() {
		return eIsSet(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__NOMINAL_BAR_DIAMETER_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBarCount() {
		return (Double) eGet(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_COUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBarCount(double newBarCount) {
		eSet(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_COUNT, newBarCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBarCount() {
		eUnset(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_COUNT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBarCount() {
		return eIsSet(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_COUNT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBarCountAsString() {
		return (String) eGet(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_COUNT_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBarCountAsString(String newBarCountAsString) {
		eSet(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_COUNT_AS_STRING, newBarCountAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBarCountAsString() {
		eUnset(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_COUNT_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBarCountAsString() {
		return eIsSet(LogPackage.Literals.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_COUNT_AS_STRING);
	}

} //IfcReinforcementBarPropertiesImpl