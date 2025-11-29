import { useState } from 'react';
import { User, Shield, LogOut } from 'lucide-react';
export default function AccountSection(){
  const [userData, setUserData] = useState({ firstName:'John', lastName:'Anderson', email:'john.anderson@email.com' });
  return (
    <div className="min-h-screen bg-gray-50 font-sans">
      <div className="bg-blue-900 text-white py-6 px-4">
        <div className="max-w-7xl mx-auto flex items-center justify-between">
          <div className="flex items-center space-x-3">
            <Shield className="w-8 h-8" />
            <div><h1 className="text-2xl font-bold">SecureNet Banking</h1><p className="text-blue-200 text-sm">Account Management</p></div>
          </div>
          <button className="flex items-center space-x-2 bg-blue-800 hover:bg-blue-700 px-4 py-2 rounded-lg"><LogOut className="w-4 h-4"/><span>Logout</span></button>
        </div>
      </div>
      <div className="max-w-7xl mx-auto py-8 px-4">
        <div className="bg-gradient-to-r from-blue-600 to-blue-700 rounded-xl p-6 mb-6 text-white shadow-lg">
          <div className="flex items-center justify-between">
            <div><h2 className="text-3xl font-bold mb-2">Welcome back, {userData.firstName}!</h2><p className="text-blue-100">Manage your account settings and preferences</p></div>
            <User className="w-20 h-20 opacity-20" />
          </div>
        </div>
        <div className="grid lg:grid-cols-4 gap-6">
          <div className="lg:col-span-1">
            <div className="bg-white rounded-xl shadow-md p-4 space-y-2">
              <p className="font-semibold">Navigation</p>
            </div>
          </div>
          <div className="lg:col-span-3">
            <div className="bg-white rounded-xl shadow-md p-6">
              <h3 className="text-xl font-semibold">Profile</h3>
              <p className="text-sm text-gray-600">Name: {userData.firstName} {userData.lastName}</p>
              <p className="text-sm text-gray-600">Email: {userData.email}</p>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}
