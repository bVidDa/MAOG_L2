/*
 * This file is part of the L2J Mobius project.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.l2jmobius.gameserver.network.serverpackets;

import org.l2jmobius.commons.network.PacketWriter;
import org.l2jmobius.gameserver.network.OutgoingPackets;

public class PetDelete implements IClientOutgoingPacket
{
	private final int _petId;
	private final int _petObjId;
	
	public PetDelete(int petId, int petObjId)
	{
		_petId = petId; // summonType?
		_petObjId = petObjId; // objectId
	}
	
	@Override
	public boolean write(PacketWriter packet)
	{
		OutgoingPackets.PET_DELETE.writeId(packet);
		packet.writeD(_petId); // dont really know what these two are since i never needed them
		packet.writeD(_petObjId); // objectId
		return true;
	}
}