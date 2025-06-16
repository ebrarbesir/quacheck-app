import 'package:flutter/material.dart';

class HomePage extends StatelessWidget {
  const HomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Anasayfa'),
      ),
      body: const Center(
        child: Text(
          'Hoşgeldiniz!',
          style: TextStyle(fontSize: 24),
        ),
      ),
    );
  }
}
